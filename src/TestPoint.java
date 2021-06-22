/**
 * Created by Hayk on 21.06.2021.
 */
public class TestPoint {
    public static void main(String[] args) {
    Point p1=new Point(1.5,2);
    Point p2=new Point(4.5,6);
        System.out.println(p2.distance());
        System.out.println(p2.distance(p1));
    }
}
