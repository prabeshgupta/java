import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isUnique(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestSubstring = substring;
                }
            }
        }

        System.out.println("Longest substring with unique characters: " + longestSubstring);
    }

    public static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}
