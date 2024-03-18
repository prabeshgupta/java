import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<String>();

        skills.add("Honest");
        skills.add("Hard Working");
        skills.add("Good communicator");

        Human h1 = new Human("Pranish Baskota", 24, 174, 70, "white", skills);

        h1.printDetails();
        System.out.println();

        Cat c1 = new Cat("Biralo", 2, 33, 2.5, "Light orange", "Meow meow");

        c1.printDetails();
        System.out.println();

        Mouse m1 = new Mouse("Musa", 1, 10, 10, "Grey", "Chu chu");

        m1.printDetails();

    }
}