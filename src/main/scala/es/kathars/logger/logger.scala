package es.kathars.logger

trait Feature {
  def f = println("Executing Feature 'f'")
}

class System extends Feature

trait Logger extends Feature { this: System =>
  override def f = {
    println("INFO: invoking f")
    super.f
  }
}

trait BDAccessor extends Feature { this: System =>
  override def f = {
    println("Access to BD")
    super.f
  }
}

object StackableApp extends App {
  val sys = new System with Logger with BDAccessor
  sys.f
}
