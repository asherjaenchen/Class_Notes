package Oct12;

public class DriverMyMath {
    //the main is static because it's the starting point of the code,
    // so it doesn't make sense to make it an instance method
    static void main() {
        //static methods
        System.out.println(MyMath.PI);

        System.out.println(MyMath.add(1,2));
        System.out.println(MyMath.mult(3,4));
        System.out.println(MyMath.circleCircumference(3));

        //instance methods
        MyMath m1 = new MyMath();
        MyMath m2 = new MyMath();

        //m1.setTemp("foo");
        System.out.println("m1 in the driver "+m1);
        System.out.println(m1.getTemp());

        System.out.println("m2 in the driver "+m2);

    }
}
