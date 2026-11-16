/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/9/26
 */

package Nov9;

public class Weapon implements Sellable {
    private int dmg;

    public Weapon(int dmg) {
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public void display(){
        System.out.println("Weapon: "+dmg);
    }

    public double getPrice(){
        return 2* dmg;
    }
}
