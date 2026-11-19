/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/19/2026
 */

package Nov18;

import java.util.ArrayList;

public class ClothingDriver {
    static void main() {
        ArrayList<Clothing> clothing = new ArrayList<>();
        clothing.add(new ButtonShirt("Cotton", 8));
        clothing.add(new ButtonShirt("Flannel", 8));
        clothing.add(new Jeans("Suede"));
        clothing.add(new Jeans("Cotton"));
        System.out.println(clothing.get(0).getName());
        System.out.println(clothing.get(1).getName());
        System.out.println(clothing.get(2).getName());
        System.out.println(clothing.get(3).getName());
        clothing.getFirst().wear();
        clothing.get(1).wear();
        clothing.get(2).wear();
        clothing.get(3).wear();

        for (Clothing c: clothing){
            if (c instanceof ButtonShirt){

            }
        }
    }
}
