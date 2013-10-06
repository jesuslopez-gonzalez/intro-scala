package es.kathars.oo

object Polymorphism {

  def id[A](a: A): A = a

  id[Int](5)
  id[String]("hola")

  id(5)
  id("hola")

  class Group[+A](val l: List[A])

  val g1: Group[Programmer] = new Group(List(
    Programmer("Richard Stallman", 60)))

  val g2: Group[Person] = g1
}
