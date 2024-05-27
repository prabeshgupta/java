import java.util.Arrays;
import java.util.Scanner;

public class AnagramFinder {
    public static void main(String[] args) {
        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of words separated by spaces");
        String[] words = sc.nextLine().split(" ");

        // Find and print the anagrams
        System.out.println("Anagrams:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    System.out.println(words[i] + " and " + words[j]);
                }
            }
        }
        sc.close();
    }

    // Returns true if the two words are anagrams, otherwise false
    public static boolean isAnagram(String word1, String word2) {
        // Sort the characters in each word
        char[] word1Chars = word1.toCharArray();
        Arrays.sort(word1Chars);
        String sortedWord1 = new String(word1Chars);

        char[] word2Chars = word2.toCharArray();
        Arrays.sort(word2Chars);
        String sortedWord2 = new String(word2Chars);

        // Check if the sorted words are equal
        return sortedWord1.equals(sortedWord2);
    }
}