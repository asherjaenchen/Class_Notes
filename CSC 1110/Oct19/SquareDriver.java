/*
 * Course: CS 1110A 111
 * Fall 2026
 * Assignment Name!!!
 * Name: Asher Jaenchen
 * Created: 10/19/26
 */

package Oct19;

public class SquareDriver {
    static void main() {
        Square[] squares = new Square[10];
        squares[0] = new Square(3);
        Square s = new Square(42);
        squares[1] = s;
        for (int i = 0; i < 10; i++){
            int side = (int)(10 * Math.random() * 10) + 1;
            squares[i] = new Square(side);
        }
        double sum = 0;
        for (int i = 0; i < squares.length; i++){
            sum += squares[i].area();
        }
        double avg = sum / squares.length;
        int numLess = 0;
        for (int i = 0; i < squares.length; i++){
            if (squares[i].area() > avg){
                numLess++;
            }
        }

        boolean result = squares[squares.length/2].
                biggerThan((squares[squares.length - 1]));
    }
}
