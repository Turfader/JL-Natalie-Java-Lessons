
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        char operation;
        int num1;
        int num2;
        float result;

        System.out.println("What to do: ");
        num1 = scanner.nextInt();
        operation = scanner.next().charAt(0);
        num2 = scanner.nextInt();
        System.out.print(num1);
        System.out.print(operation);
        System.out.print(num2);
        System.out.println("=");

        if (operation == '+') {
            result = add(num1, num2);
        }
        else if (operation == '-') {
            result = subtract(num1, num2);
        }
        else if (operation == '*') {
            result = multiply(num1, num2);
        }
        else if (operation == '/') {
            result = divide(num1, num2);
        }
        else {
            scanner.close();
            return;
        }

        System.out.println(result);
        scanner.close();

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static float divide(int a, int b) {
        return a / b;
    }
}
