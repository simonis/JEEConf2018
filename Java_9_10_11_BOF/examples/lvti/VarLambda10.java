import java.util.function.UnaryOperator;

public class VarLambda10 {

  public static void main(String[] args) {

    var var = (UnaryOperator)(x) -> x;

    System.out.println(var.apply(1));
  }
}
