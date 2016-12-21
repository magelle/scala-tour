package tour_04_mixin_class_composition

/**
  * Created by gelle on 21/12/2016.
  */
class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length()
  def next = { val ch = s charAt i; i += 1; ch }
}
