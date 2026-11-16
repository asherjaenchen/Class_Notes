/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/10/26
 */

package Nov10;

import java.util.Scanner;

public class AnimalSounds {
    private static void playSounds(String animal){
        switch (animal) {
            case "cat" -> System.out.println("Meow");
            case "dog" -> System.out.println("Woof");
            default -> System.out.println("Invalid");
        }
    }

    public static void playSoundsInterface(Animal animal){
        animal.makeSound();
    }

    static void main(){
        System.out.println("What animal sound " +
                    "would you like to play?");
        System.out.println("""
                1. Cat
                2. Dog
                """);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input){
            case 1 -> playSounds("cat");
            case 2 -> playSounds("dog");
            default -> System.out.println("Invalid");
        }
    }
}
