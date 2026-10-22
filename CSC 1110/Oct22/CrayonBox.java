/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/22/2026
 */

package Oct22;

public class CrayonBox {
    private final static int MAX_COLORS = 4;
    private String[] colors = new String[MAX_COLORS];
    private int numColors;

    public CrayonBox(String[] colors){
        this.colors = new String[MAX_COLORS];
        if (colors.length > MAX_COLORS){
            for (int i = 0; i < MAX_COLORS; i++){
                this.colors[i] = colors[i];
            }
        } else {
            for (int i = 0; i < MAX_COLORS; i++){
                this.colors[i] = colors[i];
                numColors++;
            }
        }
    }

    public CrayonBox(){
        numColors = 0;
        colors = new String[MAX_COLORS];
    }

    public int getNumColors(){
        return 0;
    }

    public void addColor(String color){

    }

    public boolean hasColor(String color){

    }

    public String lastColorAdded(){

    }

    public String display(){

    }
}
