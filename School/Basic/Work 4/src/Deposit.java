import java.util.Scanner;

public class Deposit {

    public void deposit(Account ac) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to deposit");

        double depositAmount = sc.nextDouble();

        ac.setBalance(depositAmount + ac.getBalance());

        System.out.println("Your new balance is Rs. " + ac.getBalance());

    }
}
