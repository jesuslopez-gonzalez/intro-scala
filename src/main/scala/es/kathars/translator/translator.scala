package es.kathars.translator

trait Translator {

  val dictionary: Map[String, String]

  def translate(word: String): Option[String] = dictionary.get(word)
}

object translators {

  implicit val english = new Translator {
    val dictionary = Map("hola" -> "hello")
  }

  implicit val italian = new Translator {
    val dictionary = Map("hola" -> "chao", "adios" -> "chao")
  }
}

object Translator {

  object myPrint {
    def apply(word: String)(implicit t: Option[Translator] = None) = {
      val w = (t flatMap { _.translate(word) }).getOrElse(word)
      println(s"\n###> $w\n")
    }
  }

  implicit def optTranslator(implicit t: Translator): Option[Translator] =
    Option(t)
}

object TranslateApp extends App {
  import Translator._ 

  myPrint("hola")
  myPrint("adios")

  {
    import translators.italian
    myPrint("hola")
    myPrint("adios")
  }

  {
    import translators.english
    myPrint("hola")
    myPrint("adios")
  }
}
