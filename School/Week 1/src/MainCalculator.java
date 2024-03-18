import java.util.*;

public class MainCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number ");
        double num2 = sc.nextDouble();

        System.out.println("Choose +,-,*,/");
        sc.nextLine();
        String mathOperator = sc.nextLine();

        Output getOutput = new Output();
        if (mathOperator.equals("+")) {
            System.out.println(getOutput.printSum(num1, num2));
        } else if (mathOperator.equals("-")) {
            System.out.println(getOutput.printDifference(num1, num2));
        } else if (mathOperator.equals("*")) {
            System.out.println(getOutput.printMultiplication(num1, num2));
        } else {
            System.out.println(getOutput.printDivision(num1, num2));
        }

        sc.close();
    }

}
