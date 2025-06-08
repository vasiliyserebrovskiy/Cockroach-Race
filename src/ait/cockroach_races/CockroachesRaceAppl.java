package ait.cockroach_races;
/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.06.2025)
 */

import java.util.Scanner;

/**
 * Create an application-game “TarakansRace” Tarakan - thread running loop of distance
 * iterations. At each iteration the thread prints out its own number and
 * sleeps a random amount of milliseconds [2-5] The sleeping time range should be the same for all tarakans. Tarakan that is finishing the race the first is the winner.
 * ----
 * The application should take a number of tarakans and a distance from
 * the console input/output.
 * ----
 * At the end of a game there should be printed out the following message
 * “Congratulations to tarakan #X (winner)” where X - is the tarakan-winner number
 */

public class CockroachesRaceAppl {
    public static void main(String[] args) {
        // Ask for game configuration
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number of cockroaches (a positive integer): ");
        String inputCount = sc.nextLine();

        System.out.println("Please enter the race distance (a positive integer): ");
        String inputDistance = sc.nextLine();

    }
}
