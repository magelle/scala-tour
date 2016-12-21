package _05_case_classes_and_pattern_mathcing

/**
  * Created by gelle on 19/12/2016.
  */
object Main {

  def main(args: Array[String]): Unit = {

    abstract class Tree
    case class Sum(l: Tree, r: Tree) extends Tree
    case class Var(n: String) extends Tree
    case class Const(V: Int) extends Tree

    type Environment = String => Int

    def eval(t: Tree, env: Environment): Int = t match {
      case Sum(l, r) => eval(l, env) + eval(r, env)
      case Var(n) => env(n)
      case Const(v) => v
    }

    val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env: Environment = { case "x" => 5 case "y" => 7 }
    println("Expression: " + exp)
    println("Evaluation with x=5, y=7: " + eval(exp, env))

  }

}
