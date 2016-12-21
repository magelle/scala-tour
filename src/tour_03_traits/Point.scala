package tour_03_traits

/**
  * Created by gelle on 21/12/2016.
  */
class Point(xc: Int, yc: Int) extends Similarity {

  var x: Int = xc
  var y: Int = yc

  override def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x

}
