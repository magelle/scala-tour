package tour_04_mixin_class_composition

/**
  * Created by gelle on 21/12/2016.
  */
object StringIteratorTest {
  def main(args: Array[String]) {
    class Iter extends StringIterator(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }
}
