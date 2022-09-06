/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality
package exceptions

/** @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
class InvalidStatValueException(description: String)
    extends Exception("The required condition is not met. $description")
