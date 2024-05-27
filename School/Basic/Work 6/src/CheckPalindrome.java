import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");
        String word = sc.nextLine();

        // Make object of class StringBuffer
        StringBuffer sb = new StringBuffer(word);
        // Reverse text
        sb.reverse();

        // StringBuffer to String
        String reverse = new String(sb);

        // Check if palindrome
        if (word.equals(reverse)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }

        sc.close();
    }
}
