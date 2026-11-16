/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/10/26
 */

package Nov9;

import java.util.ArrayList;

public class SellableDriver {
    static void main() {
        Sellable s1;
        //s1 = new Sellable()
        s1 = new Weapon(12);

        ArrayList<Sellable> sellables = new ArrayList<>();
        sellables.add(new Weapon(1));
    }
}
