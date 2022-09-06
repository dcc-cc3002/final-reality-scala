/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character.player

import model.character.GameCharacter

import java.util.Objects
import java.util.concurrent.BlockingQueue

/** A `Knight` is a type of [[PlayerCharacter]] that can equip `Sword`s, `Axe`s and `Knife`s.
  *
  * @param name
  *   the character's name
  * @param maxHp
  *   the character's maximum health points
  * @param defense
  *   the character's defense
  * @param turnsQueue
  *   the queue with the characters waiting for their turn
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
class Knight(
    name: String,
    maxHp: Int,
    defense: Int,
    turnsQueue: BlockingQueue[GameCharacter]
) extends AbstractPlayerCharacter(name, maxHp, defense, turnsQueue) {

  override def equals(obj: Any): Boolean = obj match {
    case that: Knight => super.equals(that)
    case _            => false
  }

  override def hashCode(): Int =
    Objects.hash(classOf[Knight], name, maxHp, defense)

  override def toString: String = s"Knight { " +
    s"name: '$name', " +
    s"maxHp: $maxHp, " +
    s"defense=$defense " +
    s"}"
}
