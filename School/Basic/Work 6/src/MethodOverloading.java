public class MethodOverloading {
    public static void main(String[] args) {

        sumTwoNumbers(4, 8);
        diffTwoNumbers(4.1, 2.2);

    }

    public static void sumTwoNumbers(int num1, int num2) {
        System.out.println("Sum is " + (num1 + num2));
    }

    public static void sumTwoNumbers(double num1, double num2) {
        System.out.println("Sum is " + (num1 + num2));
    }

    public static void diffTwoNumbers(int num3, int num4) {
        System.out.println("Difference is " + (num3 - num4));
    }

    public static void diffTwoNumbers(double num3, double num4) {
        System.out.printf("Difference is %.3f", (num3 - num4));
    }

}
