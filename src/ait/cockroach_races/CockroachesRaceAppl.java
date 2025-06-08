/*
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

package ait.cockroach_races;

import ait.cockroach_races.model.Cockroach;
import ait.cockroach_races.utils.Utils;

import java.util.Scanner;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.06.2025)
 */

public class CockroachesRaceAppl {
    public static void main(String[] args) {

        int numberOfCockroaches = Utils.readInputParameter("Please, enter number of cockroaches (a positive integer): ");
        int raceDistance = Utils.readInputParameter("Please enter the race distance (a positive integer): ");

        // TODO: This is a temp output
        System.out.println("Game parameters:");
        System.out.println("Number of cockroaches: " + numberOfCockroaches);
        System.out.println("Race distance: " + raceDistance);

        // Test run without threads
        Cockroach firstCockroach = new Cockroach(13);
        firstCockroach.race(raceDistance);

        // TODO: Start race with Threads

        System.out.println("The winner name is: " + Cockroach.getWinnerName());

    }

}
