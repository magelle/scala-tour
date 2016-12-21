package tour_10_pattern_matching

/**
  * Created by gelle on 21/12/2016.
  */
object MatchTest1 extends App {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  println(matchTest(3))
}
