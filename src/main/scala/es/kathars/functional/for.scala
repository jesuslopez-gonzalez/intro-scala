package es.kathars.functional

object ForApp extends App {

  {
    var acc = 0

    for (i <- 1 to 10)
      acc = acc + i

    println(s"####> acc values '$acc'")
  }

  {
    val res = (1 to 10).foldLeft(0) { (acc, i) =>
      acc + i
    }

    println(s"####> res values '$res'")
  }
}
