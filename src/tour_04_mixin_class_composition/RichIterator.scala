package tour_04_mixin_class_composition

/**
  * Created by gelle on 21/12/2016.
  */
trait RichIterator extends AbsIterator {

  def foreach(f: T => Unit) {
    while (hasNext) f(next)
  }

}
