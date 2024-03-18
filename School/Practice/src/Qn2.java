// WAP TO CALCULATE SUM OF DIGITS OF INTEGERS

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer");
        int num = sc.nextInt();

        int temp = 0;
        int sum = 0;

        while (num > 0) {
            temp = num % 10;
            sum += temp;
            num /= 10;

        }

        System.out.println("Sum of Digits of integer is " + sum);
    }
}
