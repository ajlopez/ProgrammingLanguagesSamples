
// Based on an example Seven Languages in Seven Weeks book
// http://pragprog.com/book/btlang/seven-languages-in-seven-weeks
// original code at 
// http://pragprog.com/titles/btlang/source_code


import scala.actors._
import scala.actors.Actor._

case object Poke
case object Feed

class Kid() extends Actor {
  def act() {
    loop {
      react {
        case Poke => {
          println("Ow...")
          println("Quit it...")
        }
        case Feed => {
          println("Gurgle...")
          println("Burp...")
        }
      }
    }
  }
}

object Kids extends Application {

    val bart = new Kid().start
    val lisa = new Kid().start
    println("Ready to poke and feed...")
    bart ! Poke
    lisa ! Poke
    bart ! Feed
    lisa ! Feed

}