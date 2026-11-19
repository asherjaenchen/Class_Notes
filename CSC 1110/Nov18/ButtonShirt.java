/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/18/2026
 */

package Nov18;

public class ButtonShirt extends Clothing {
    private final int maxButtons;
    private int numButtons;

    public ButtonShirt(String material, int numButtons){
        super(material);
        this.numButtons = numButtons;
        maxButtons = numButtons;
    }

    public void clean(){
        double loseButton = Math.random();
        if (loseButton < DAMAGE_CHANCE && numButtons != 0){
            numButtons -= 1;
        }
        super.clean();
    }

    public int getNumButtons(){
        return numButtons;
    }

    public int getMaxButtons(){
        return maxButtons;
    }

    public String getName(){
        if (isDirty()){
            return "Dirty" + material + "Shirt";
        } else {
            return "Clean" + material + "Shirt";
        }
    }
}
