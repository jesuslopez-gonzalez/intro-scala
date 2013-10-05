package es.kathars.oo

class Person(var name: String, var age: Int)

object Person {
  def apply(name: String, age: Int) =
    new Person(name, age)
}

class Programmer(
  name: String, 
  age: Int, 
  var skills: List[String]) extends Person(name, age)

object Programmer {
  def apply(name: String, age: Int, skills: List[String] = List()) =
    new Programmer(name, age, skills)
}

object PersonApp extends App {

  // Object instantiation using 'new'
  val p1 = new Person("Jordi Hurtado", Int.MaxValue)

  // And now using companion factory, the 'apply' method is applied automatically!
  val p2 = Person("Jordi Hurtado", Int.MaxValue)
}
