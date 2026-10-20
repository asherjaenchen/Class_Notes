/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/20/26
 */

package Oct20;

import java.util.Scanner;

public class NumElements {
    static void main() {
        //Ask the user for 10 ints, but also like them
        // enter 'q' to quit entering values

        //And at the end, we want to print out the
        //average of the values that they entered

        Scanner in = new Scanner(System.in);
        final int maxEntries = 10;
        int [] nums = new int[maxEntries];
        boolean done = false;
        int sum = 0;
        int numElements = 0;
        while (!done && numElements < 10){
            System.out.println("Enter a value or '-1' to quit");
            int input = in.nextInt();
            if(input >= 0){
                nums[numElements] = input;
                sum += input;
                numElements++;
            } else {
                done = true;
            }
        }

        double avg = (double) sum / numElements;
        System.out.println("The average is "+avg);
    }
}
