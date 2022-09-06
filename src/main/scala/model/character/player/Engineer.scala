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

/** @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
class Engineer(
    name: String,
    maxHp: Int,
    defense: Int,
    turnsQueue: BlockingQueue[GameCharacter]
) extends AbstractPlayerCharacter(name, maxHp, defense, turnsQueue) {
  override def equals(obj: Any): Boolean = obj match {
    case that: Engineer =>
      hashCode() == that.hashCode() &&
        name == that.name &&
        maxHp == that.maxHp &&
        defense == that.defense
    case _ => false
  }

    override def hashCode(): Int = Objects.hash(classOf[Engineer], name, maxHp, defense)
}
