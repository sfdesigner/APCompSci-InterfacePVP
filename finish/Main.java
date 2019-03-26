import java.util.ArrayList;

public class Main {

    public static Party friends;
    public static Party foes;

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("Sentri"));
        players.add(new Mage("Jaana"));
        players.add(new Paladin("Dupre"));
        players.add(new Priest("Antos"));

        Tank t = null;
        Range r = null;
        Healer h = null;

        for (PlayerCharacter x : players) {
            if (x instanceof Tank) {
                t = (Tank) x;
            }

            if (x instanceof Range) {
                r = (Range) x;
            }

            if (x instanceof Healer) {
                h = (Healer) x;
            }
        }

        friends = new Party(t,r,h);

        foes = new Party(new Paladin("Dark Knight"),new Mage("Nosfentor"),new Priest("Sin'Virall"));

        System.out.println("Our heroes:");
        friends.showStats();
        System.out.println("Our enemies:");
        foes.showStats();

    }
}
