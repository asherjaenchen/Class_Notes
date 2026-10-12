/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/12/2026
 */

package Oct12;

public class CircleDriver {
    static void main() {
        Circle c1 = new Circle(3, "c1");
        Circle c2 = new Circle(4, "c2");
        Circle c3 = new Circle(5, "c3");

        //printing out a global static variable of an instance object
        System.out.println(Circle.count);
        System.out.println(Circle.count);
        System.out.println(Circle.count);

    }
}
