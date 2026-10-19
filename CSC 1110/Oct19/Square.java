/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/19/26
 */

package Oct19;

import java.util.Scanner;

public class Square {
    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public boolean biggerThan(Square that){
        return this.area() > that.area();
    }
}
