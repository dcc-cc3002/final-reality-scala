/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character.player

import exceptions.Require
import model.character.GameCharacter

import java.util.Objects
import java.util.concurrent.BlockingQueue

/** A White Mage is a type of [[PlayerCharacter]] that can cast white magic.
  *
  * @param name
  *   the character's name
  * @param maxHp
  *   the character's maximum health points
  * @param _maxMp
  *   the character's maximum magic points
  * @param defense
  *   the character's defense
  * @param turnsQueue
  *   the queue with the characters waiting for their turn
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
class WhiteMage(
    name: String,
    maxHp: Int,
    _maxMp: Int,
    defense: Int,
    turnsQueue: BlockingQueue[GameCharacter]
) extends AbstractPlayerCharacter(name, maxHp, defense, turnsQueue) {
  val maxMp: Int = Require.Stat(_maxMp, "Max MP") atLeast 0
  private var _currentMp = maxMp

  /** The current MP of the character. */
  def currentMp: Int = _currentMp

  /** Sets the current MP to `newMp`.
    * The value of `newMp` must be between 0 and the `maxMp`.
    */
  def currentMp_=(newMp: Int): Unit = {
    _currentMp = Require.Stat(newMp, "Current MP") in Range(0, maxMp)
  }

  override def equals(obj: Any): Boolean = obj match {
    case that: WhiteMage =>
      super.equals(that) &&
        maxMp == that.maxMp
    case _ => false
  }

  override def hashCode(): Int =
    Objects.hash(classOf[WhiteMage], name, maxHp, maxMp, defense)

  override def toString: String = s"WhiteMage { " +
    s"name: '$name', " +
    s"maxMp: $maxMp, " +
    s"maxHp: $maxHp, " +
    s"defense: $defense " +
    s"currentMp: $currentMp, " +
    s"}"
}
