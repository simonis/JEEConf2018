import java.util.function.UnaryOperator;

public class VarLambda11 {

  public static void main(String[] args) {

    var var = (UnaryOperator<Integer>)(var x) -> x;

    System.out.println(var.apply(1));
  }
}
