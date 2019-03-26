public class Party {

    private Tank partyTank;
    private Range partyRange;
    private Healer partyHealer;

    public Party(Tank t, Range r, Healer h) {
        partyTank = t;
        partyRange = r;
        partyHealer = h;
    }

    public void showStats() {
        System.out.println("Tank:");
        partyTank.showStats();
        System.out.println("Range:");
        partyRange.showStats();
        System.out.println("Healer:");
        partyHealer.showStats();
    }
}
