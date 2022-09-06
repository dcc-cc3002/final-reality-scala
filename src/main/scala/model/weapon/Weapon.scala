/*
 * "final-reality-scala" (c) by Ignacio Slater M.
 * "final-reality-scala" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.weapon

import model.weapon.WeaponType.WeaponType

import java.util.Objects

/** A class that holds all the information of a weapon.
  *
  * @constructor Creates a weapon with a name, a base damage, speed and it's type.
  * @author Ignacio Slater Muñoz.
  * @author ~Your name here~.
  */
class Weapon(
    val name: String,
    val damage: Int,
    val weight: Int,
    val weaponType: WeaponType
) {
  override def equals(o: Any): Boolean = o match {
    case that: Weapon =>
      hashCode() == that.hashCode() &&
        name == that.name &&
        damage == that.damage &&
        weight == that.weight &&
        weaponType == that.weaponType
    case _ => false
  }

  override def hashCode(): Int =
    Objects.hash(classOf[Weapon], name, damage, weight, weaponType)

  override def toString: String = s"Weapon {" +
    s"name: $name, " +
    s"damage: $damage, " +
    s"weight: $weight, " +
    s"type: $weaponType" +
    s"}"
}
