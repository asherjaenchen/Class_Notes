/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/2/26
 */

package Nov2;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam2Review {
    static void main() {
        int[] nums = {1,2,3,4,5};

        int index = -1;
        for (int i = 0; i < nums.length && index == -1; i++){
            if (nums[i] == 3){
                index = i;
            }
        }

        for (int i: nums){
            System.out.println(2 * i);
        }

        String[] words = {"foo", "bar", "taco", "cat"};
        StringBuilder sb = new StringBuilder();
        for (String s: words){
            sb.append(s.charAt(s.length()-1));
        }
        System.out.println(sb);

        ArrayList<String> words2 = new ArrayList<>(Arrays.asList(words));
        int sum = 0;
        for (String s: words2){
            sum += s.length();
        }


    }
}
