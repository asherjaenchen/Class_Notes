/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/22/26
 */

package Oct22;

public class Arrays2D {
    static void main() {
        int[] v = {1,2,3,4,5};

        int[][] board = new int[5][5];
        board[1][1] = 1; //left
        board[1][3] = 1; //right
        board[2][2] = 1; //nose

        board[2][0] = 1;
        board[3][0] = 1;
        board[4][2] = 1;

        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                System.out.print(board[r][c]+" ");
            }
            System.out.println();
        }
    }
}
