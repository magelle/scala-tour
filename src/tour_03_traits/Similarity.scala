package tour_03_traits

/**
  * Created by gelle on 21/12/2016.
  */
trait Similarity {

  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = ! isSimilar(x)

}
