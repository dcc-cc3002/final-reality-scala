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

/**
 * A class that holds all the information of a weapon.
 *
 * @constructor Creates a weapon with a name, a base damage, speed and it's type.
 * @author Ignacio Slater Muñoz.
 * @author <YOUR NAME HERE>
 */
class Weapon(val name: String, val damage: Int, val weight: Int, val weaponType: WeaponType) {

//  override def equals(o: Any): Boolean = {
//    if (this eq o) {
//      return true
//    }
//    if (!((o.isInstanceOf[Weapon]))) {
//      return false
//    }
//    val weapon: Weapon = o.asInstanceOf[Weapon]
//    return getDamage == weapon.getDamage && getWeight == weapon.getWeight && getName == weapon
//      .getName && (getType eq weapon.getType)
//  }
//
//  override def hashCode: Int = {
//    return Objects.hash(getName, getDamage, getWeight, getType)
//  }
}
