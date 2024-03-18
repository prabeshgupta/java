import java.util.ArrayList;

public class Player {
    // Properties
    private String name;
    private int age;
    private double height;
    private double weight;
    private double salary;
    private ArrayList<String> skills;

    // Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
