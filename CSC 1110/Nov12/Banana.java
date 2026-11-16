/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/12/2026
 */

package Nov12;

public class Banana implements Fruit{
    private boolean peeled;

    public Banana(){
        peeled = false;
    }

    public void peel(){
        peeled = true;
    }

    public boolean isPeeled(){
        return peeled;
    }

    public boolean isPrepped() {
        return isPeeled();
    }

    @Override
    public void prep() {
        peel();
    }

    @Override
    public void display() {
        if (isPrepped()){
            System.out.println(Fruit.PREPPED_COLOR + "Banana" + Fruit.RESET);
        } else {
            System.out.println(Fruit.NOT_PREPPED_COLOR + "Banana" + Fruit.RESET);
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
