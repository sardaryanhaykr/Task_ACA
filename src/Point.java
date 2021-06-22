/**
 * Created by Hayk on 21.06.2021.
 */
public class Point {
    private double x;
    private double y;

    public Point(){}
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(x-point.getX(),2)+Math.pow(y-point.getY(),2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
