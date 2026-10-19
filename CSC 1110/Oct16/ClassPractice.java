/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/16/2026
 */

package Oct16;

import java.util.Scanner;

public class ClassPractice {
    static void main() {
        //Prompt 1
//        double[] d = new double[3];
//        d[0] = 1.0;
//        d[1] = 1.5;
//        d[2] = 2.0;
//
//        System.out.println(d[0]);
//        System.out.println(d[1]);
//        System.out.println(d[2]);
//
//        for (int i = 0; i < d.length; i++){
//            d[i] = Math.random();
//            System.out.println(d[i]);
//        }

        // Prompt 2
//        String[] s = new String[3];
//        s[0] = "john";
//        s[1] = "tom";
//        s[2] = "ted";
//
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
//
//        for (int i = 0; i < s.length; i++){
//            s[i] = s[i].substring(0, s[i].length()/2);
//            System.out.println(s[i]);
//        }

//        //Prompt 3
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a size for an array");
//        int size = scan.nextInt();
//        int[] nums;
//        nums = new int [size]; //size is 3
//
//        for (int i = 0; i < nums.length; i++){
//            int input = scan.nextInt();
//            nums[i] = input;
//        }
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++){
//            sum += nums[i];
//        }
//        double avg = (double)sum/nums.length;
//        int minIndex = 0;
//        int minValue = nums[0];
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] < minValue){
//                minValue = nums[i];
//                minIndex = i;
//            }
//        }

        //Prompt 4
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random()*10)+1;
            sum += numbers[i];
        }
        double average = (double)sum/numbers.length;
        int length1 = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < average){
                length1++;
            }
        }
        int[] smaller = new int[length1];
        int[] larger = new int[numbers.length-length1];
        int j = 0;

        for (int i = 0; i < smaller.length; i++){
            if (numbers[i] < average){
                smaller[j] = numbers[i];
                j++;
            }
        }

        int k = 0;
        for (int l = 0; l < larger.length; l++){
            larger[k] = numbers[k];
            l++;
        }
    }
}
