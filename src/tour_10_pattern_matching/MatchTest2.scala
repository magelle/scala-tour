package tour_10_pattern_matching

/**
  * Created by gelle on 21/12/2016.
  */
object MatchTest2 extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
  }

  println(matchTest("two"))
}
