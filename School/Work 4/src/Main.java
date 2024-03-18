import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Objects of classes
        Account account = new Account();
        Deposit dep = new Deposit();
        Withdraw with = new Withdraw();
        Balance bal = new Balance();
        Loan loa = new Loan();
        Scanner sc = new Scanner(System.in);

        // To get customer details

        System.out.println("Enter your name");
        account.setName(sc.nextLine());
        System.out.println("Enter the account number");
        account.setAccNo(sc.nextLine());
        System.out.println("Enter your balance");
        account.setBalance(sc.nextDouble());

        // try catch block
        try {

            int choice;
            int count = 0;

            do {
                System.out.println("\n1. Deposit\n2. Withdraw \n3. Loan process\n4. Balance inquiry\n5. Exit");
                System.out.println("Enter your choice");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        dep.deposit(account);
                        break;
                    case 2:
                        if (count < 5) {
                            with.withdraw(account);
                            count++;
                        } else {
                            System.out.println("Withdrawal limit exceed");
                        }
                        break;
                    case 3:
                        loa.loan(account);
                        break;
                    case 4:
                        bal.balance(account);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Character");

                }
            } while (choice != 5);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        sc.close();
    }

}
