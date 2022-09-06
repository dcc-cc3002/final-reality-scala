/*
 * "final-reality-scala" (c) by Ignacio Slater M.
 * "final-reality-scala" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package model.weapon

/**
 * Enumeration of all the weapon types.
 *
 * @author Ignacio Slater Muñoz.
 * @author <Your name>
 */
object WeaponType extends Enumeration {
  type WeaponType = Value
  val SWORD, AXE, KNIFE, STAFF, BOW = Value
}
