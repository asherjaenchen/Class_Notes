/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/2/26
 */

package Nov2;

public class Point {
    private int x;
    private int y;
    private int[] coordinates;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
        this.x = x;
        this.y = y;
    }

    public double dist(Point point){
        return Math.sqrt(Math.pow(this.x-point.x, 2) + Math.pow(this.y-point.y, 2));
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public String toString(){
        return "Point{x="+x+", y="+y+"}";
    }
}
