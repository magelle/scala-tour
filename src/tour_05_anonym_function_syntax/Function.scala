package tour_05_anonym_function_syntax

/**
  * Created by gelle on 21/12/2016.
  */
object Function {

  def main(args: Array[String]): Unit = {
    // same
    (x: Int) => x + 1

    // same
    new Function1[Int, Int] {
      def apply(x: Int) = x + 1
    }

    // other with several parameters
    (X: Int, y: Int) => "(" + x + ", " + y + ")"

    // other with no parameter
    () => System.getProperty("user.dir")

    // Function types
    // Int => Int
    // (Int, Int) => String

    // Same
    // Function1[Int, Int]
    // Function2[Int, Int, String]
    // Function0[String]
  }

}
