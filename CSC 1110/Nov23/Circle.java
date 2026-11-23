/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/23/2026
 */

package Nov23;

public class Circle {
    private double radius;

    public Circle(double radius) throws IllegalArgumentException{
        if(radius < 0){
            System.out.println("Error!!! Radius is invalid");
            throw new IllegalArgumentException();

        }
        this.radius = radius;
    }

    public double circumference(){
        return Math.PI * 2 * getRadius();
    }

    public double getRadius(){
        return this.radius;
    }

    public double setRadius(double radius){
        return this.radius = radius;
    }
}
