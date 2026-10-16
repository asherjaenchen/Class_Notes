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

        //Prompt 3
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an length.");
        int[] i = new int[in.nextInt()];

        for (int j = 0; j < i.length; j++){
            System.out.println("Enter an integer.");
            i[j] = in.nextInt();
        }

    }
}
