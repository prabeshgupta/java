import java.util.ArrayList;

public class Human extends Mammal {

    private ArrayList<String> skills;

    // Constructor
    Human(String name, int age, double height, double weight, String color, ArrayList<String> skills) {
        super(name, age, height, weight, color);
        this.skills = skills;
    }

    // Getter

    public ArrayList<String> getSkills() {
        return skills;
    }

    // Setter

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    // Method

    public void printDetails() {
        super.printDetails();
        String humanSkills = "";
        for (String skill : skills) {
            humanSkills = humanSkills + skill + ",";
        }
        System.out.println("Skills: " + humanSkills + " etc.");

    }
}
