/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/22/2026
 */

package Oct22;

public class PassByValueArray {
    private static void printArray(int[] list){
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "");
        }
        for(int i: list){       // for each loop
            System.out.print(i + " ");
            // THIS DOES NOT CHANGE THE UNDERLYING LIST
        }
        // MODIFY TO ACCOMMODATE CHANGE
        int index = 0;
        for(int i: list){
            list[index] = i * -1;
            index++;
        }
        System.out.println();
    }
    private static void negate(int[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = list[i] * -1;
        }
    }
    private static int[] copyArray(int[] original){
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
        return copy;
    }
    static void main() {
        int[] nums = {1,2,3,4,5};
        printArray(nums);
        int[] numCopy = copyArray(nums);
        negate(numCopy);
        System.out.println("Nums");
        printArray(nums);
        printArray(numCopy);

        String[] words = {"foo", "bar", "taco", "cat"};
        for (String s: words){ // for each loop
            System.out.println(s);
        }
    }
}
