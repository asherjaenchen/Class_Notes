/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/27/26
 */

package Oct27;

import java.util.ArrayList;

public class ArrayListAndMethods {
    // reverse that makes a new ArrayList of Integer that is
    // the reverse of a passed-in ArrayList
    private static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> rev = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            rev.add(0, list.get(i));
        }
        return rev;
    }
    // method that takes in a size and max value and returns an ArrayList of
    // random ints
    private static ArrayList<Integer> randomArray(int size, int max){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < size; i++){
            // add random values
        }
        return null; // return arrayList
    }

    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            nums.add(i);
        }

        ArrayList<Integer> nums1 = nums;

        System.out.println(nums);
        System.out.println(nums1);

    }
}
