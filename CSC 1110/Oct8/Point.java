package Oct8;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double dist(Point other){
        int x1 = x;
        int y1 = y;
        int x2 = other.getX();
        int y2 = other.getY();
        double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        return d;
    }
    public String display(){
        return "x: "+x+" , "+"y:"+y;
    }

    /**
     * Returns the quadrant that this point lies in.
     * 1:(+,+), 2:(-,+), 3:(-,-), 4:(+,-)
     * @return
     */
    public int quadrant(){
        int ret;
        if(x < 0){
            if(y < 0){
                ret = 3;
            } else{
                ret = 2;
            }
        } else{
            if(y < 0){
                ret = 4;
            } else{
                ret = 1;
            }
        }
        return ret;
    }
}
