/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/26/26
 */

package Oct26;

import java.util.ArrayList;

public class ArrayListBasics {
    static void main() {
        // arrays (and array lists) are linear data structures
        // arrays lists can do everything an array can at the cost of memory
        // initialize array
        String[] words1 = new String[4];
        words1[0] = "foo";
        words1[1] = "bar";
        words1[2] = "taco";

        System.out.println(words1.length);

        // initialize array list
        ArrayList<String> words2;
        words2 = new ArrayList<>();
        //1. array and arraylist difference
        System.out.println("Size of ArrayList is "+words2.size());
        words2.add("cat");
        System.out.println("Size of ArrayList after cat"+words2.size());
        words2.add("dog");
        words2.add("mouse");
        words2.add("fish");
        System.out.println("Size of ArrayList after all animals"+words2.size());

        //2. getting elements
        System.out.println(words1[1]);
        System.out.println(words2.get(1));

        //3. setting elements
        words1[3] = "hello";
        words2.set(words2.size()-1, "horse");

        //4. printing out the elements
        System.out.println(words1);
        for (int i = 0; i < words1.length; i++){
            System.out.println(words1[i] + " ");
        }
        System.out.println(words2);

        //5. insert elements
        words2.add("bird");
        System.out.println(words2);

        //6. iterate over
        String msg = "";
        for (int i = 0; i < words2.size(); i++){
            msg += words2.get(i);
        }

        //7. primitives
        int[] nums = new int[3];
        nums[0] = 42;
        nums[1] = 67;
        nums[2] = 100;

        Integer x = 5;
        System.out.println(++x);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(42);
        nums2.add(67);
        nums2.add(100);

        System.out.println(nums2);

        ArrayList<Boolean> flags;
        ArrayList<Double> nums3;
    }
}
