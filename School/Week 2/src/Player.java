import java.util.ArrayList;

public class Player {

    // Properties
    public String name;
    public int age;
    public double height;
    public String position;
    public ArrayList<String> skills;
    public double wage;

    // Constructor
    public Player(String name, int age, double height, String position, ArrayList skills, double wage) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
        this.skills = skills;
        this.wage = wage;

    }

    // Method
    public void playersDetails() {
        System.out.println("Player's name: " + this.name);
        System.out.println(this.name + "'s age: " + this.age);
        System.out.println(this.name + "'s height: " + this.height);
        System.out.println(this.name + "'s position: " + this.position);

        for (String printSkills : skills) {
            System.out.println(this.name + "'s skills: " + printSkills);
        }

        System.out.println(this.name + "'s wage: " + this.wage);
    }

}
