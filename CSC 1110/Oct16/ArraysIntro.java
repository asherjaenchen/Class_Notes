/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/16/2026
 */

package Oct16;

public class ArraysIntro {
    static void main() {
        //array of integers
        int[] value;
        value = new int[3];


        value[0] = 42;
        value[1] = -1;

        System.out.println(value[0]);
        System.out.println(value[1]*10);
        System.out.println(value[2]);

        //array of strings
        String[] words = new String[3];
        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";

        System.out.println(words[0]);

        System.out.println(words[1].charAt(0));

    }
}
