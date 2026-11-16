/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 11/10/26
 */

package Nov10;

public class Player {
    private int x;
    private int y;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x -= x;
        this.y -= y;
    }

    public void drawPlayer(){
        for (int xSpace = 0; xSpace < x; xSpace++){
            for (int ySpace = 0; ySpace < y; ySpace++){
                System.out.print(" ");
                if (xSpace == x - 1 && ySpace == y - 1){
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }

}
