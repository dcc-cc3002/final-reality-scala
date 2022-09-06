/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.finalreality

import model.character.GameCharacter
import model.character.player.Thief
import model.weapon.{Weapon, WeaponType}

import java.util.concurrent.LinkedBlockingQueue
import scala.util.Random

/** @author <a href="https://github.com/r8vnhill">R8V</a>
  * @author ~Your name~
  */
object TimerExample {
  def main(args: Array[String]): Unit = {
    val queue = new LinkedBlockingQueue[GameCharacter]()
    for (i <- Range(0, 10)) {
      // Gives a random speed to each character to generate different waiting times
      val weapon = new Weapon("", 0, Random.nextInt(50) + 1, WeaponType.KNIFE)
      val character = new Thief(s"$i", 10, 10, queue)
      character.equip(weapon)
      character.waitTurn()
    }
    // Waits for 6 seconds to ensure that all characters have finished waiting
    Thread.sleep(6000)
    while (!queue.isEmpty) {
      println(queue.poll())
    }
  }
}
