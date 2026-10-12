package Oct12;

public class StaticvsNonStatic {
    static void main() {
        //static
        int x = 10;
        Math.sqrt(x);

        //nonstatic
        String m = "hello";
        System.out.println(m.length());

        //static
        Character.isDigit('5');
    }
}
