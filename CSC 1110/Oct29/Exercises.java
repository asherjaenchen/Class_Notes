/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/29/26
 */

package Oct29;

import java.util.ArrayList;
import java.util.Random;

public class Exercises {
    static void main(){

    }

    public class ListMethods {

        public static String largestString(ArrayList<String> list) {
            if (list.isEmpty()) {
                return null;
            }
            String largest = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).length() > largest.length()) {
                    largest = list.get(i);
                }
            }
            return largest;
        }

        public static String lastLetters(ArrayList<String> list) {
            String result = "";
            for (String s : list) {
                if (!s.isEmpty()) {
                    result += s.charAt(s.length() - 1);
                }
            }
            return result;
        }

        public static int countChar(ArrayList<String> list, char target) {
            int count = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == target) {
                        count++;
                    }
                }
            }
            return count;
        }

        public static ArrayList<Integer> randomInts(int size, int max) {
            Random rand = new Random();
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                result.add(rand.nextInt(max + 1));
            }
            return result;
        }

        public static ArrayList<Integer> negate(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int n : list) {
                result.add(-n);
            }
            return result;
        }

        public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                result.add(list.get(i));
            }
            return result;
        }

        public static ArrayList<Integer> doubleList(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int n : list) {
                result.add(n);
            }
            for (int n : list) {
                result.add(n);
            }
            return result;
        }
    }

}
