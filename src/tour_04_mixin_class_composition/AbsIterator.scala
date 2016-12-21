package tour_04_mixin_class_composition

/**
  * Created by gelle on 21/12/2016.
  */
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
