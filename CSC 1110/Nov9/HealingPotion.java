/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/9/26
 */

package Nov9;

public class HealingPotion {
    private int maxRestore;

    public HealingPotion(int maxRestore){
        this.maxRestore = maxRestore;
    }

    public int getMaxRestore(){
        return maxRestore;
    }

    public void display(){
        System.out.println("Healing Potion: "+maxRestore);
    }

    public double getPrice(){
        return 1.5 * maxRestore;
    }
}
