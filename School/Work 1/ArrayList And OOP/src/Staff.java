import java.util.ArrayList;

public class Staff {
    // Properties of staff

    public String name;
    public String gender;
    public int age;
    public double salary;
    public String address;
    public ArrayList<String> features;

    // Parameterized Constructor

    Staff(String name, String gender, int age, double salary, String address, ArrayList<String> features) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.features = features;

    }

    // Method = No parameter and no return type

    public void staffInfo() {

        System.out.println("Name of staff: " + this.name);
        System.out.println("Gender of staff: " + this.gender);
        System.out.println("Age of staff: " + this.age);
        System.out.println("Salary of staff: " + this.salary);
        System.out.println("Address of staff: " + this.address);

        // For each loop
        for (String feature : this.features) {
            System.out.println("Feature of staff: " + feature);
        }

    }
}
