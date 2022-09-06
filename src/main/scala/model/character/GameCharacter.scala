/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character

/** This represents a character from the game.
  *  A character can be controlled by the player or by the CPU (an enemy).
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
trait GameCharacter {

  /** The character's name. */
  val name: String

  /** The maximum health points of the character. */
  val maxHp: Int

  /** The current health points of the character. */
  var currentHp: Int

  /** The defense of the character. */
  val defense: Int

  /** Sets a scheduled executor to make this character (thread) wait for `speed / 10`
   *  seconds before adding the character to the queue.
   */
  def waitTurn(): Unit
}
