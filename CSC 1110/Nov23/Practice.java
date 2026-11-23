/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/23/2026
 */

package Nov23;

import java.util.Scanner;

public class Practice {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Enter the date in the form mm/dd/yyyy");
        try {
            input = scan.nextLine();
            int year = Integer.parseInt(input.substring(6));
            if (year < 0) {
                throw new IllegalArgumentException("Invalid year " + year);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a non-negative year");
        }
    }
}
