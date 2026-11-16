/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/12/2026
 */

package Nov12;

public class Apple implements Fruit {
    private int numSeeds;

    public Apple(int numSeeds){
        this.numSeeds = numSeeds;
    }

    public void removeSeeds(){
        this.numSeeds = 0;
    }


    public int getNumSeeds(){
        return this.numSeeds;
    }

    @Override
    public boolean isPrepped() {
        return numSeeds == 0;
    }

    @Override
    public void prep() {
        removeSeeds();
    }

    @Override
    public void display() {
        if (isPrepped()){
            System.out.println(Fruit.PREPPED_COLOR + "Apple" + Fruit.RESET);
        } else {
            System.out.println(Fruit.NOT_PREPPED_COLOR + "Apple" + Fruit.RESET);
        }
    }

    public void processFruit(Fruit fruit) {
        if (!isPrepped()){
            prep();
        } else {
            System.out.println("Fruit is already prepped.");
        }
    }
}
