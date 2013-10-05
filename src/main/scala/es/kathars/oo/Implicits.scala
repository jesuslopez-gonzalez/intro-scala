package es.kathars.oo

import language.implicitConversions
import language.postfixOps

object Implicits extends App {

  /*** Implicit Values ***/

  implicit val a: Int = 1

  def f(implicit a: Int) = println(s"####> $a")

  // Explicit invocation
  f(2)

  // Implicit invocation, this takes 'a' as input!
  f

  /*** Implicit Defs ***/

  implicit def fromIntToString(a: Int) = a.toString

  def g(a: String) = println(s"####> $a")

  // There's no need to convert a String
  g("3")

  // However, this needs to enable the implicit converter
  g(3)

  /*** Implicit Classes ***/

  implicit class IntHelper(a: Int) {
    def weirdDef = println(s"####> $a")
  }

  4 weirdDef
}
