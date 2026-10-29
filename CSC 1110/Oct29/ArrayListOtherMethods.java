/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/29/26
 */

package Oct29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOtherMethods {
    static void main() {
        // as list
        String[] w = {"foo", " bar", "taco"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(w));

        // index of
        System.out.println(words.indexOf("taco"));
        System.out.println(words.indexOf("hello"));

        // last index of
        System.out.println(words.indexOf("taco"));

        // remove
        System.out.println("Before " + words);
        System.out.println(words.size());
        words.remove("foo");
        System.out.println("After " + words);
        System.out.println(words.size());

        while(words.contains("taco")){
            words.remove("taco");
        }

        // isEmpty
        System.out.println(words.isEmpty());
        while(!words.isEmpty()){
            words.remove(0);
        }
        System.out.println(words.isEmpty());

        Integer[] n = {3, 1, 2, 3, 4};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(n));

        nums.remove((Integer) 3);

        // for each
        for (Integer x: nums){
            System.out.println(x * 2);
        }
    }
}
