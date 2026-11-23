/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/23/2026
 */

package Nov23;

import java.util.Scanner;

public class ExceptionExample {
    static void main() {
        String[] words = new String[3];
        words[0] = "foobar";
        words[1] = "1234";
        String pass = "1234";

        // organized from most specific to least specific
        // Exception -> Runtime (unchecked)
        //           -> Checked exceptions
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non-negative index");
        String input = scan.nextLine();
        int i;
        try {
            i = Integer.parseInt(input);
            if (i < 0){
                throw new IllegalArgumentException("Index needs to be positive: " + i);
            }
            System.out.println("Index is "+i);
            System.out.println("Element at index is "+words[i]);
        } catch (NumberFormatException e){
            System.out.println("Error parsing input to an int: " + input);
        } catch (IllegalArgumentException e){
            System.out.println("Error with index");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error with index in an array");
            System.out.println(e.getMessage());
        }
    }
}
