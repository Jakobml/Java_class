package calculator;

import calculator.type.*;

import java.util.Scanner;

/**
 * Created by jane on 2015-12-06.
 */
public class AdvancedCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while(true) {


            System.out.println("Enter first value");
            int value = input.nextInt();
            System.out.println("Enter second value");
            int value2 = input.nextInt();
            System.out.println("Choose type of calculation(+, -, *, /)");
            String calculationTypeString = input.next();
            CalculationType calculationType = getCalculationType(calculationTypeString);
            System.out.print(calculationType.calculate(value, value2));
        }

    }
    private static CalculationType getCalculationType(String calculationTypeString){
        if(calculationTypeString.equals("+")){
            return new Addition();
        }
        else if (calculationTypeString.equals("-")){
            return new Subtraction();

        }
        else if(calculationTypeString.equals("*")){
            return new Multiplication();
        }
        else if(calculationTypeString.equals("/")){
            return new Division();
        }
        throw new IllegalArgumentException("Could not recognize symbol " + calculationTypeString);
    }
}
