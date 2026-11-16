/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/16/2026
 */

package Nov16;

public class Furniture {
    protected String material;
    private double basePrice;

    public Furniture(String material, double basePrice){
        this.material = material;
        this.basePrice = basePrice;
    }

    public double getPrice(){
        return basePrice;
    }

    public String getName(){
        return material + "Furniture";
    }
}
