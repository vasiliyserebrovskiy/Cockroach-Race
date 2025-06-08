package ait.cockroach_races.model;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.06.2025)
 */
public class Cockroach implements Beetle, Runnable {
    private static int winnerName = -1;
    private static int distance;
    private int name;


    public Cockroach(int name) {
        this.name = name;
    }

    public static int getWinnerName() {
        return winnerName;
    }

    public static void setWinnerName(int winnerName) {
        if (Cockroach.winnerName == -1) {
            Cockroach.winnerName = winnerName;
        } else {
            System.out.println("The winner has already been determined.");
        }
    }

    public static void setDistance(int distance) {
        if (Cockroach.distance == 0 && distance > 0) {
            Cockroach.distance = distance;
        } else {
            System.out.println("Distance is already set or invalid.");
        }
    }

    @Override
    public int randomSleep() {
        return (int) (Math.random() * 4) + 2;
    }

    @Override
    public void race(int dist) {
        for (int i = 0; i < dist; i++) {
            System.out.printf("Cockroach name : %d, iteration %d.", name, i);
            try {
                int temp = randomSleep();
                System.out.println("Sleep time now: " + temp);
                Thread.sleep(temp);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        if (winnerName == -1) setWinnerName(name);

    }

    @Override
    public void run() {
        race(distance);
    }
}
