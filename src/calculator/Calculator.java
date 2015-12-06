package calculator;

import java.util.Scanner;

/**
 * Created by jane on 2015-12-06.
 */
public class Calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first value");
        int value = input.nextInt();
        System.out.println("Enter your second value");
        int value2 = input.nextInt();
        System.out.println("Choose type of calculation(+, -, *, /)");
        String calculationType = input.next();

        if(calculationType.equals("+")){
            System.out.println(value + value2);
        }
        else if(calculationType.equals("-")){
            System.out.println(value - value2);
        }
        else if(calculationType.equals("*")){
            System.out.println(value * value2);
        }
        else if(calculationType.equals("/")){
            System.out.println(value / value2);
        }
        else{
            System.out.println("Could not understand "+ calculationType);
        }
    }
}
