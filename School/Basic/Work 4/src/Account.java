public class Account {
    // Access modifiers as private
    private String name;
    private String accNo;
    private double balance;

    // Getter methods

    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
