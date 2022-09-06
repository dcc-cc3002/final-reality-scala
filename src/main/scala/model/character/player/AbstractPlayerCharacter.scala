/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character.player

import model.character.{AbstractCharacter, GameCharacter}
import model.weapon.Weapon

import java.util.concurrent.BlockingQueue

/** A class that holds all the information of a player-controlled character in the game.
  *
  * @param name
  *   the character's name
  * @param maxHp
  *   the character's maximum health points
  * @param defense
  *   the character's defense
  * @param turnsQueue
  *   the queue with the characters waiting for their turn
  * @constructor Creates a new playable character.
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
abstract class AbstractPlayerCharacter(
    name: String,
    maxHp: Int,
    defense: Int,
    turnsQueue: BlockingQueue[GameCharacter]
) extends AbstractCharacter(name, maxHp, defense, turnsQueue)
    with PlayerCharacter {
  var _equippedWeapon: Weapon = _
  override def equippedWeapon: Weapon = _equippedWeapon

  override def equip(weapon: Weapon): Unit = {
    _equippedWeapon = weapon
  }
}
