/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/16/2026
 */

package Oct16;

public class ArrayIterate {
    static void main() {
        //arrays allow us to iterate through data
        int[] nums = new int[3];
        nums[0]= 5;
        nums[1] = 10;
        nums[2] = 15;

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
