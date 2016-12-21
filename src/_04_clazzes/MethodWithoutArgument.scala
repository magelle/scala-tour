package _04_clazzes

class MethodWithoutArgument(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary

  override def toString: String = {
    "" + re + (if (im<0) "" else "+") + im + "i"
  }
}
