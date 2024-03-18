import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        // Replace targeted word
        String changedName = name.replaceAll("Thapa", "Papa");

        System.out.println("Name is " + changedName);
    }
}
