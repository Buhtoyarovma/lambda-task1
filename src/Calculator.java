import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    //В таком варианте возможно деление на ноль, чего делать нельзя.

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    //Переделал на вариант по аналогии с abs, через тернарный оператор. При этом в случае с делением на ноль будет приниматься значение нуля


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;


}
