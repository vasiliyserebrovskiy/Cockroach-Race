package ait.cockroach_races.model;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.06.2025)
 */
public class Cockroach implements Beetle{
   private static int winnerName;
   private int name;

    public Cockroach(int name) {
        this.name = name;
    }

    public static int getWinnerName() {
        return winnerName;
    }

    public static void setWinnerName(int winnerName) {
        Cockroach.winnerName = winnerName;
    }

    @Override
    public void running(int dist) {
        int sleepTime = (int)(Math.random() *4) + 2;

    }
}
