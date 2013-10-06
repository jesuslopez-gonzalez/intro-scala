package es.kathars.functional

object PatternMatchingApp extends App {

  case class Name(first: String, last: String)

  case class Programmer(name: Name, age: Int, skills: List[String] = List())

  def isCandidate(p: Programmer) = p match {
    case Programmer(_, _, skills) if skills contains "Scala" => true
    case Programmer(Name("Richard", "Stallman"), _, _) => true
    case _ => false
  }

  val martin = Programmer(Name("Martin", "Odersky"), 55, List("Scala", "Java"))
  val richard = Programmer(Name("Richard", "Stallman"), 60, List("Lisp"))
  val jordi = Programmer(Name("Jordi", "Hurtado"), Int.MaxValue)

  isScalaCandidate(martin)  // true
  isScalaCandidate(richard) // true
  isScalaCandidate(jordi)   // false
}
