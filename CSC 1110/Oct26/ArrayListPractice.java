/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/26/26
 */

package Oct26;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int rnd = (int)(Math.random() * 10);
            nums.add(rnd);
        }

        int last = nums.get(nums.size()-1);
        int first = nums.get(0);
        System.out.println(last + first);

        int maxIndex = 0;
        int maxValue = nums.get(maxIndex);

        // Create an ArrayList of Strings
        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input;

        //Add 5 Strings
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a string: ");
            input = scan.next();
            words.add(input);
        }

        // Check if first and last are same
        if (words.get(0).equals(words.get(2))){
            System.out.println("First and middle strings are same.");
        }

        // Iterate and find a
        ArrayList<Integer> indeces = new ArrayList<>();
        for (int i = 0; i < words.size(); i++){
            if (words.contains("a")){
                indeces.add(i);
            }
        }

        //replace a with "hello"
        for (int i = 0; i < words.size(); i++){
            if (indeces.contains(i)){
                words.set(i, "hello");
            }
        }


    }
}
