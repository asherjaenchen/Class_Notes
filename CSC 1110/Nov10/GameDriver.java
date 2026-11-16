/*
 * Course: CS 1110A 111
 * Fall 2026
 * totally listening during class *cough
 * Name: Asher Jaenchen
 * Created: 11/10/26
 */

package Nov10;

import java.util.Scanner;

public class GameDriver {
    private static Player protagonist;
    private static boolean gamePlay;
    private static Scanner scan;
    private static String input;

    static void main() {
        protagonist = new Player(0, 0);
        gamePlay = true;
        scan = new Scanner(System.in);
        input = "";

        do{
            input = scan.next();
            gameLoop(input);
        } while (gamePlay);
    }

    static void gameLoop(String input){
        System.out.println(input);
    }

}
