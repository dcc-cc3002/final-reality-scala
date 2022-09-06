/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character

import exceptions.Require
import model.character.player.PlayerCharacter

import java.util.concurrent.{
  BlockingQueue,
  Executors,
  ScheduledExecutorService,
  TimeUnit
}

/** An abstract class that holds the common behaviour of all the characters in the game.
  *
  * @param name
  *     the character's name
  * @param _maxHp
  *     the character's maximum health points
  * @param _defense
  *     the character's defense
  * @param turnsQueue
  *     the queue with the characters waiting for their turn
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
abstract class AbstractCharacter(
    override val name: String,
    _maxHp: Int,
    _defense: Int,
    private val turnsQueue: BlockingQueue[GameCharacter]
) extends GameCharacter {
  private var scheduledExecutor: ScheduledExecutorService = _

  override val maxHp: Int = Require.Stat(_maxHp, "Max Hp") atLeast 1

  private var _currentHp: Int = maxHp
  override def currentHp: Int = _currentHp
  def currentHp_=(newHp: Int): Unit =
    _currentHp = Require.Stat(newHp, "Current Hp") in (0 to maxHp)

  override val defense: Int = Require.Stat(_defense, "Defense") atLeast 0

  override def waitTurn(): Unit = {
    scheduledExecutor = Executors.newSingleThreadScheduledExecutor
    if (this.isInstanceOf[PlayerCharacter])
      scheduledExecutor.schedule(
        addToQueue,
        this.asInstanceOf[PlayerCharacter].equippedWeapon.weight / 10,
        TimeUnit.SECONDS
      )
    else {
      val enemy = this.asInstanceOf[Enemy]
      scheduledExecutor.schedule(
        addToQueue,
        enemy.weight / 10,
        TimeUnit.SECONDS
      )
    }
  }

  val addToQueue: Runnable = () => {
    turnsQueue.put(AbstractCharacter.this)
    scheduledExecutor.shutdown()
  }
}
