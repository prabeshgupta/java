import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<String>();

        // For Player 1

        skills.add("Dribbler");
        skills.add("Shooter");
        skills.add("Header");

        Player p1 = new Player("Cristiano Ronaldo", 38, 183, "Striker", skills, 19000000);

        // For Player 2

        skills.clear();

        skills.add("Dribbler");
        skills.add("Shooter");
        skills.add("Passer");
        skills.add("Tackler");

        Player p2 = new Player("Leonel Messi", 35, 160, "Right Winger", skills, 40000000);

        // For player 3

        skills.clear();
        skills.add("Shooter");
        skills.add("Passer");
        skills.add("Tackler");

        Player p3 = new Player("Neymar Jr.", 30, 162, "Striker", skills, 10000000);

        // Team Work

        ArrayList<Player> team = new ArrayList<Player>();

        team.add(p2);
        team.add(p3);

        Team t1 = new Team("PSG", "1980", team);

        t1.printAll();
        System.out.println();
        team.clear();

        team.add(p1);

        Team t2 = new Team("Manchester United", "1950", team);
        t2.printAll();
    }
}
