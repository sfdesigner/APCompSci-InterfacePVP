import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("Sentri"));
        players.add(new Mage("Jaana"));
        players.add(new Paladin("Dupre"));
        players.add(new Priest("Antos"));

        System.out.println(players.size());

        for (PlayerCharacter x : players) {
            if (x instanceof Priest) {
                System.out.println("Here is a priest:");
                x.showStats();
            }
        }


    }
}
