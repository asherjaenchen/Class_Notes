//
package Oct12;
//utility class

public class MyMath {
    private String temp;

    // instance methods
    public void setTemp(String temp){
        this.temp = temp;
    }

    public String getTemp(){
        System.out.println(this);
        setTemp("foobar");
        return temp;
    }

    //static methods
    public static final double PI = 3;

    public static double add(double a, double b){
        return a + b;
    }

    public static double mult(double a, double b){
        return a * b;
    }

    public static double circleCircumference(double radius){
        return mult(radius, 2) * PI;
    }
}
