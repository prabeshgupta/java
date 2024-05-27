import java.util.ArrayList;

public class Team {
    // Properties
    public String name;
    public String establishDate;
    public ArrayList<Player> players;

    // Constructor
    Team(String name, String establishDate, ArrayList<Player> players) {
        this.name = name;
        this.establishDate = establishDate;
        this.players = players;

    }

    // Method
    public void printAll() {

        System.out.println("Team name is " + name);
        System.out.println("Team was established in " + establishDate);

        for (Player player : players) {
            player.playersDetails();
        }
    }

}
