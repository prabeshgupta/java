
import java.util.Scanner;

public class ThrowExceptionMessage {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number");
            display();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void display() throws Exception {
        try {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

        } catch (Exception ex) {
            throw new Exception("Number is not valid");
        }
    }
}
