import java.util.Scanner;

public class Withdraw {

    public void withdraw(Account ac) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw");
        double amount = sc.nextDouble();

        if (amount <= ac.getBalance()) {
            ac.setBalance(ac.getBalance() - amount);
            System.out.println("Withdraw successful of Rs. " + amount);
            System.out.println("your new balance is Rs. " + ac.getBalance());
        } else {
            System.out.println("Withdraw failed of Rs. " + amount + " Please, deposit first.");
        }
    }

}
