package tour_03_traits

/**
  * Created by gelle on 21/12/2016.
  */
object TraitsTest extends App {
  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(3, 3)
  val p4 = new Point(2, 3)
  println(p1.isSimilar(p2))
  println(p1.isSimilar(p3))
  // Point's isNotSimilar is defined in Similarity
  println(p1.isNotSimilar(2))
  println(p1.isNotSimilar(p4))
}
