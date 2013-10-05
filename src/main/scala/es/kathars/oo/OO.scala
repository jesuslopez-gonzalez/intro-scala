package es.kathars.oo

class Person(var name: String, var age: Int)

class Programmer(
  name: String, 
  age: Int, 
  var skills: List[String]) extends Person(name, age)
