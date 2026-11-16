/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/12/2026
 */

package Nov12;

import java.util.ArrayList;
import java.util.Random;

public class FruitDriver {
    public static Fruit spawnFruit(){
        Random random = new Random();
        int c = random.nextInt(0, 2);
        if (c == 1){
            return new Apple(random.nextInt(0, 11));
        }
        return new Banana();
    }

    static void main(){
        ArrayList<Fruit> fruits = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            fruits.add(spawnFruit());
        }
        for (Fruit f: fruits){
            f.display();
        }
    }

    public static boolean checkFruit(Fruit fruit){
        if (fruit instanceof Apple){
            Apple a = (Apple) fruit;
            if (((Apple) fruit).getNumSeeds() < 5){
                return true;
            }
        }
        return false;
    }
}
