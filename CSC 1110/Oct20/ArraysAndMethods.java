/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/20/26
 */

package Oct20;

public class ArraysAndMethods {
    private static void printArray(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++){
            if (i == nums.length - 1){
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println("]");
    }
    private static int[] randomArray(int size, int max){
        int[] ret = new int[size];
        for (int i = 0; i < ret.length; i++){
            ret[i] = (int)(Math.random()*max) + 1;
        }
        return ret;
    }
    private static int outOfBounds(int[] numArray, int num){
        if (num > 0 && num < numArray.length){
            return numArray[num];
        }
        return 0;
    }
    private static int min(int[] numArray){
        int min = numArray[0];
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] < min){
                min = numArray[i];
            }
        }
        return min;
    }
    private static int[] half(int[] numArray){
        int[] ret = new int[numArray.length / 2];
        for (int i = 0; i< ret.length; i++){
            ret[i] = numArray[i];
        }
        return ret;
    }
    static void main() {
        int[] nums = randomArray(5, 10);
        printArray(nums);
    }
}
