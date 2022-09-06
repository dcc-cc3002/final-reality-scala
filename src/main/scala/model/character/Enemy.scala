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

import java.util.Objects
import java.util.concurrent.BlockingQueue

/** A class that holds all the information of a single enemy of the game.
  *
  * @param name
  *     the enemy's name
  * @param _weight
  *     the enemy's weight
  * @param maxHp
  *     the enemy's max hp
  * @param defense
  *     the enemy's defense
  * @param turnsQueue
  *     the queue with the characters waiting for their turn
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
class Enemy(
    name: String,
    _weight: Int,
    maxHp: Int,
    defense: Int,
    turnsQueue: BlockingQueue[GameCharacter]
) extends AbstractCharacter(name, maxHp, defense, turnsQueue) {
  val weight: Int = Require.Stat(_weight, "Weight") atLeast 1

  override def equals(obj: Any): Boolean = obj match {
    case that: Enemy =>
      that.hashCode() == this.hashCode() &&
        that.name == name &&
        that.weight == weight &&
        that.maxHp == maxHp &&
        that.defense == defense
    case _ => false
  }

  override def hashCode(): Int =
    Objects.hash(classOf[Enemy], name, weight, maxHp, defense)
}
