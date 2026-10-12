/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/12/2026
 */

package Oct12;

public class Circle {
    private double radius;
    private String id;
    //public int count = 0; //leaving this without static causes problems...
    public static int count = 0; //adding static makes this variable globle

    public Circle(double radius, String id){
        this.radius = radius;
        this.id = id;
        count++; // initially, we are only incrementing the count for the given instance
        // adding a static to the int count increments the count for all Circle objects
    }
}
