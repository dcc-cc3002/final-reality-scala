/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.character.player

import model.weapon.Weapon

/** A character controlled by the user.
  *
  * @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
trait PlayerCharacter {

  /** The weapon that the character is currently using */
  def equippedWeapon: Weapon

  /** Equips a weapon to the character. */
  def equip(weapon: Weapon): Unit
}
