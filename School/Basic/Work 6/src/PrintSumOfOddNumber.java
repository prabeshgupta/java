import java.util.Scanner;

public class PrintSumOfOddNumber {
    public static void main(String[] args) {
        int sum = 0;

        // Make object of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // Initialize array
        int[] array = new int[size];

        System.out.println("Enter the numbers");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();

            // Check if number if odd
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum of odd numbers is " + sum);

        sc.close();
    }
}
