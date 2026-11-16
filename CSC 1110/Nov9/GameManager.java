/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/9/26
 */

package Nov9;

import java.util.ArrayList;

public class GameManager {
    static void main() {
        ArrayList<Sellable> inventory = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            int r = (int)(Math.random() * 10) + 5;
            inventory.add(new HealingPotion(r));
        }

        System.out.println("Displaying items");
        for (int i = 0; i < inventory.size(); i++){
            inventory.get(i).display();
        }

        int sellPrice = 0;
        for (int i = 0; i < inventory.size(); i++){
            sellPrice += inventory.get(i).getPrice();
        }
        System.out.println("Sold for "+sellPrice);

    }
}
