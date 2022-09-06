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
  * @author  ~Your name~
  */
object Require {
  case class Stat(private val stat: Int, private val name: String) {
    def in(range: Range): Int = if (range.contains(stat)) {
      stat
    } else {
      throw new InvalidStatValueException(
        s"'$name'($stat must be in range $range"
      )
    }

    def atLeast(i: Int): Int = if (stat > i) {
      stat
    } else {
      throw new InvalidStatValueException(s"'$name'($stat must be at least $i")
    }
  }
}
