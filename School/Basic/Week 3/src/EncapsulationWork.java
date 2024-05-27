import java.util.ArrayList;

public class EncapsulationWork {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<String>();

        skills.add("Shooter");
        skills.add("Tackler");
        skills.add("Pacer");
        skills.add("Dribbler");

        Player p1 = new Player();

        p1.setName("Leonel Messi");
        p1.setAge(35);
        p1.setHeight(163);
        p1.setWeight(70);
        p1.setSalary(80000000);
        p1.setSkills(skills);

        System.out.println("Name of player: " + p1.getName());
        System.out.println("Age of player: " + p1.getAge());
        System.out.println("Height of player: " + p1.getHeight());
        System.out.println("Weight of player: " + p1.getWeight());
        System.out.println("Salary of player: " + p1.getSalary());

        String uniqueSkills = "";
        for (String skill : p1.getSkills()) {
            // if there is player 2 with xyz skills then if we use skills then it will show
            // skills of player 2, but we need player 1 skills to print rather than player 2

            uniqueSkills = uniqueSkills + skill + ", ";
        }

        String properSkills = uniqueSkills.substring(0, uniqueSkills.length() - 2)
                + ".";
        System.out.println("Skills of player " + properSkills);

    }
}