package tour_02_classes

/**
  * Created by gelle on 21/12/2016.
  */
object Classes {
  def main(args: Array[String]): Unit = {
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}
