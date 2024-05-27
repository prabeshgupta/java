// Write a Java program to reverse a string.

import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {

        System.out.println(reverse());

    }

    public static String reverse() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String word = sc.nextLine();

        String temp = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            temp += word.charAt(i);
        }
        return "Reversed String is " + temp;

    }

}
