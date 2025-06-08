package ait.cockroach_races.utils;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.06.2025)
 */
public class Utils {
    public boolean isInteger(String str) {
        return str.matches("\\d+"); // Только положительные целые числа
    }
}
