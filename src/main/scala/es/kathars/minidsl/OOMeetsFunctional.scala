package es.kathars.minidsl

object OOMeetsFunctional extends App {

  def Scala = ()

  object Functional

  object Oriented {
    def Meets(f: Functional.type) =
      "¡Bienvenidos a 'Introducción a Scala'!"
  }

  object Object {
    def -(o: Oriented.type) = Oriented
  }

  Scala
  Object-Oriented Meets Functional
}
