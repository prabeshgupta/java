import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinMaxNumber {
    public static void main(String[] args) {

        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // Initialize array
        int[] array = new int[size];
        System.out.println("Enter the numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int temp;
        for (int j = 0; j < array.length; j++) {
            // Compare array element with succeeding elements
            for (int k = j; k < array.length; k++) {
                // Swap if array element is bigger
                if (array[j] > array[k]) {
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }

        System.out.println("Minimum number: " + array[0]);
        System.out.println("Maximum number: " + array[array.length - 1]);
        sc.close();

    }
}
