/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/23/2026
 */

package Nov23;

public class CircleDriver {
    private static Circle makeCircle(int radius) throws Exception{
        return new Circle(radius);
    }
    static void main() throws Exception{
        Circle c1 = new Circle(-5);
        System.out.println("Circle circumference ");
        System.out.println(c1.circumference());
    }
}
