import java.util.function.UnaryOperator;

public class AddOne implements UnaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer + 1;
    }
}
