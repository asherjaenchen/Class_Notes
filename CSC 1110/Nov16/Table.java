/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/16/2026
 */

package Nov16;

public class Table extends Furniture{
    private double width;

    public Table(String material, double basePrice, double width){
        super(material, basePrice); // the first thing a subclass must do is create a superclass
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public double getPrice(){
        return super.getPrice();
    }


    public String getName(){
        return material + "Table";
    }
}
