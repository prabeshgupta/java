
public class StringFunctions {
    public static void main(String[] args) {

        // .equalsIgnoreCase --> Ignore Lower and Upper Case then proceed to equals
        String name1 = "Prabesh";
        String name2 = "prabesh";

        System.out.println(name1.equalsIgnoreCase(name2));

        /*
         * .compareTo --> Compare the string lexicographically, firstly it converts
         * Strings to decimal then subtract return difference in int
         * 
         * 0 = s1 = s2
         * + = s1 > s2
         * - = s1 < s2
         */

        String s1 = "a"; // decimal value 97
        String s2 = "b"; // decimal value 98
        String s3 = "A"; // decimal value 65

        System.out.println(s1.compareTo(s2)); // 97 - 98 = -1
        System.out.println(s1.compareTo(s3)); // 97 - 65 = 32

        String s4 = "prabesh";
        String s5 = "Prabesh";

        System.out.println(s4.compareToIgnoreCase(s5));

        // trim --> removes whitespaces that is in the front and end of String

        String address = "  Pepsicola Kathmandu nepal      ";
        System.out.println(address.trim());

        // indexOf --> to get index of char

        String book = "Aadhunik Bigyan";
        System.out.println(book.indexOf("i"));
        System.out.println(book.indexOf("i", 7));

    }
}
