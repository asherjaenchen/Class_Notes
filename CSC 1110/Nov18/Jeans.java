/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/19/2026
 */

package Nov18;

import java.util.ArrayList;

public class Jeans extends Clothing {
    private static final int[] TEAR_SIZE_RANGE = {1, 5};
    private ArrayList<Integer> tears;

    public Jeans(String material){
        super(material);
    }

    public void wear(){
        double tearJeans = Math.random();
        if (tearJeans < DAMAGE_CHANCE){
            int newTear = (int) (Math.random() * (TEAR_SIZE_RANGE[1] -
                    TEAR_SIZE_RANGE[0] + 1) + TEAR_SIZE_RANGE[0]);
            tears.add(newTear);
        }
        super.clean();
    }

    public ArrayList<Integer> getTears(){
        return tears;
    }

    public String getName(){
        if (super.isDirty()){
            return "Dirty" + super.material + "Jeans";
        } else {
            return "Clean" + super.material + "Jeans";
        }
    }
}
