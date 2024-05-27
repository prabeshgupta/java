
import java.util.ArrayList;

public class TryCatch {

    public static void main(String[] args) {

        try {
            ArrayList<String> subjects = new ArrayList<>();

            subjects.add("Probability and Statistics");
            subjects.add("JAVA");
            subjects.add("Data Structure and Algorithm");
            subjects.add("Web technology");

            System.out.println(subjects.get(1));
            System.out.println("Size of arraylist is " + subjects.size());

            subjects.add("System analysis and Designing");
            System.out.println(subjects.get(4));
            System.out.println("Size of arraylist is " + subjects.size());

            System.out.println(subjects.get(5));

            display();
        } catch (Exception ex) {

            System.out.println(ex.toString());
            // display();
        } finally {
            System.out.println("Syabash beta, music");
        }

    }

    public static void display() {
        System.out.println("Samina amina yeh yeh waka waka yeh yeh!");
    }

}
