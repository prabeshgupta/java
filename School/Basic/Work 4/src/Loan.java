
import java.util.Scanner;

public class Loan {

    double principle;
    double interestRate;
    int time;

    public void loan(Account ac) {

        Scanner sc = new Scanner(System.in);

        // To apply for loan, balance must be 0
        if (ac.getBalance() == 0) {

            System.out.println("Applying for Loan");
            System.out.println();

            System.out.println("Enter principle amount");
            principle = sc.nextDouble();

            System.out.println("Enter interest rate");
            interestRate = sc.nextDouble();

            System.out.println("Enter time duration");
            time = sc.nextInt();

            ac.setBalance(principle);
            System.out.println("Your new Balance is Rs. " + ac.getBalance());

        } else {

            // Compounded monthly
            System.out.println(
                    "Interest amount to pay Rs."
                            + (principle * (Math.pow((1 + (time * interestRate / 1200)), time) - 1)));
            System.out.println("Your Balance is Rs. " + ac.getBalance());

        }

    }
}
