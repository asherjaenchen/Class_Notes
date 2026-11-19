/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/18/2026
 */

package Nov18;

public abstract class Clothing {
    public static final double DAMAGE_CHANCE = 0.5;
    protected final String material;
    private boolean dirty;

    public Clothing(String material){
        this.material = material;
        dirty = false;
    }

    public void wear(){
        dirty = true;
    }

    public void clean(){
        dirty = false;
    }

    public boolean isDirty() {
        return dirty;
    }

    public abstract String getName();
}
