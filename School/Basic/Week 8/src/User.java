public class User {

    // Attributes
    private String name;
    private int age;
    private String address;
    private String number;

    // Parameterized Constructor
    public User(String name, int age, String address, String number) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.number = number;
    }

    // Method
    public void display() {
        // System.out.printf("%-30f | %-3f | %-30 | %-10f", "Name", "Age", "Address",
        // "Number");
        // System.out.printf("%-30f | %-3f | %-30 | %-10f", this.name, this.age,
        // this.address, this.number);
        System.out.println(name + "\n" + age + "\n" + address + "\n" + number);
    }

}
