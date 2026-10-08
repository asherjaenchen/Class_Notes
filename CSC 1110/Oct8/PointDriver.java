package Oct8;

import java.util.Scanner;

public class PointDriver {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an x value");
        int x = scan.nextInt();
        System.out.println("Enter a y value");
        int y = scan.nextInt();
        Point p1 = new Point(x, y);
        System.out.println(p1.display());
        System.out.println("Is in quadrant " + p1.quadrant());
        Point p2 = new Point(0, 0);
        do {
            System.out.println("Enter x and y for a point that is within 5 of the first point.");
            System.out.println(p1.display());
            System.out.print("x: ");
            p2.setX(scan.nextInt());
            System.out.print("y: ");
            p2.setY(scan.nextInt());
            System.out.println("Distance between the points is " + p1.dist(p2));
            if (p1.dist(p2) >= 5) {
                System.out.println("Distance is too large.");
            }
        } while (p1.dist(p2) >= 5);
    }
}