import java.util.Scanner;

/**
 * Created by jane on 2015-12-06.
 */
public class Application {
    public static void main(String[] args){
        System.out.println("Hello world");
        int integer = 0;
        Integer integerObject = 0;

        Scanner input = new Scanner(System.in);
        String name = null;
        System.out.println("Write something");
        name = input.next();
        System.out.print("Hello " + name);

        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
}
