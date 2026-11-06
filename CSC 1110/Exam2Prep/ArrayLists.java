/*
 * Course: CS 1110A 111
 * Fall 2026
 * Exam Prep
 * Name: Asher Jaenchen
 * Created: 11/4/202
 */

package Exam2Prep;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    static void main() {
        doubles();
        strings();
    }

    private static void doubles(){
        ArrayList<Double> doubles = new ArrayList<>();
        final int amount = 10;

        for (int i = 0; i < amount; i++){
            doubles.add(Math.random());
        }

        double sum = doubles.getFirst() + doubles.getLast();
        System.out.println(sum);

        double maxVal = 0;

        for (double d: doubles){
            if (d > maxVal){
                maxVal = d;
            }
        }

        doubles.set(doubles.indexOf(maxVal), -1 * 1.0);
    }

    public static void strings(){
        Scanner scan = new Scanner(System.in);
        final int stringAmount = 5;
        ArrayList<String> strings = new ArrayList<>();
        boolean firstAndLast = false;

        for (int i = 0; i < stringAmount; i++){
            System.out.print("Enter a string: ");
            strings.add(scan.next());
        }

        if (strings.getFirst().equals(strings.get(strings.size()/2))){
            firstAndLast = true;
        }

        for (String s: strings){
            if (s.contains("a")){
                strings.set(strings.indexOf(s), "hello");
            }
        }
    }

    private static String largestString(ArrayList<String> strings){
        int maxLength = 0;
        String maxString = "";
        for (String s: strings){
            if (s.length() > maxLength){
                maxString = s;
                maxLength = s.length();
            }
        }

        return maxString;
    }

    private static String concatenation(ArrayList<String> strings){
        StringBuilder concatenation = new StringBuilder();
        for (String s: strings){
            concatenation.append(s.charAt(s.length()-1));
        }
        return concatenation.toString();
    }

    private static int occurrences(ArrayList<String> strings, Character c){
        int occurrences = 0;
        for (String s: strings){
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == c){
                    occurrences++;
                }
            }
        }
        return occurrences;
    }

    private static ArrayList<Integer> randomInts(int size, int maxVal){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < size; i++){
            int randInt = (int)(Math.random() * maxVal) + 1;
            ret.add(randInt);
        }
        return ret;
    }

    private static ArrayList<Integer> negate(ArrayList<Integer> nums){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i: nums){
            ret.add(-1 * i);
        }
        return ret;
    }

    private static ArrayList<Integer> ret(ArrayList<Integer> nums){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; i--){
            for (int j = 0; j < nums.size(); j++){
                ret.add(j, nums.get(i));
            }
        }
        return ret;
    }

    private static ArrayList<Integer> copyList(ArrayList<Integer> nums){
        ArrayList<Integer> ret = new ArrayList<>();
        for (Integer n: nums){
            ret.add(n);
            ret.add(n);
        }
        return ret;
    }

    private void integerList(){
        ArrayList<Integer> nums = new ArrayList<>();
        final int length = 10;
        final int maxVal = 6;
        for (int i = 0; i < length; i++){
            int randInt = (int)(Math.random() * maxVal);
            nums.add(randInt);
        }
        do {
            nums.remove((Integer) 3);
        } while (nums.contains(3));

        int x = 0;

    }
}
