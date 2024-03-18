import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();

    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            // Using Recursion
            return number * factorial(number - 1);
        }

    }
}
