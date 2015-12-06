package calculator.type;

/**
 * Created by jane on 2015-12-06.
 */
public class Addition implements CalculationType {
    @Override
    public int calculate(int value, int value2){
        return value + value2;
    }

}
