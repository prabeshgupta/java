import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = sc.nextLine();

        // Make object of class StringBuffer
        StringBuffer sb = new StringBuffer(text);
        // Reverse text
        sb.reverse();

        // StringBuffer to String
        String reverse = new String(sb);
        System.out.println(reverse);

        sc.close();
    }
}
