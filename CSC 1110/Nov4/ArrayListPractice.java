/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/4/26
 */

package Nov4;

import java.util.ArrayList;
public class ArrayListPractice {
    static void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("asher");
        names.add("ben");
        names.add("chloe");

        names.set(1, "Dana");
        names.set(names.indexOf("ben"), "eli");
        names.remove("asher");

        System.out.println(names.size());
        printArray(names);
    }

    public static void printArray(ArrayList<String> a){
        for (String s: a){
            System.out.println(s.toString());
        }
    }
}
