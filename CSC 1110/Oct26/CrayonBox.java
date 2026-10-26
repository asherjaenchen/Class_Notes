/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/26/26
 */

package Oct26;

public class CrayonBox {
    private static final int MAX_COLORS = 4;
    private String[] colors;
    private int numColors;

    public CrayonBox(){
        colors = new String[MAX_COLORS];
        numColors = 0;
    }
    public CrayonBox(String[] colors){
        this.colors = new String[MAX_COLORS];
        for (int i = 0; i < MAX_COLORS && i < colors.length; i++){
            this.colors[i] = colors[i];
            numColors++;
        }
    }
    public int getNumColors(){
        return numColors;
    }
    public void addColor(String color){
        if (numColors < MAX_COLORS){
            this.colors[numColors] = color;
            numColors++;
        }
    }

    public String getLastColor(){
        if (numColors == 0){
            return null;
        } else {
            return colors[numColors-1];
        }
    }

}
