object ex4 {
  import java.util.Scanner
  import java.io.File
  import scala.collection.immutable.{SortedMap => Map}

  def main(args: Array[String]) {
    val in = new Scanner(new File("ex2.data"))
    var counts = Map[String, Int]()

    while (in.hasNext()) {
      val word = in.next()
      counts += (word -> (counts.getOrElse(word, 0) + 1))
    }

    assert(counts("foo") == 2)
    assert(counts("baz") == 1)
    assert(counts("quux") == 3)

    println(counts.mkString("\n"))
  }
}
