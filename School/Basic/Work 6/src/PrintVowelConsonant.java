import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintVowelConsonant {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        // HashSet collection
        Set<Character> vowels = new HashSet<Character>();
        Set<Character> consonants = new HashSet<Character>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if character or not
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                // Check vowel or consonant
                if (checkVowels(ch)) {
                    vowels.add(ch);
                } else {
                    consonants.add(ch);
                }
            }
        }

        // Print vowels
        System.out.print("Vowels: ");
        for (char vowel : vowels) {
            System.out.printf("%-2s", vowel);
        }
        System.out.println();

        // Print consonants
        System.out.print("Consonants: ");
        for (char consonant : consonants) {
            System.out.printf("%-2s", consonant);
        }

        sc.close();

    }

    public static boolean checkVowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

}
