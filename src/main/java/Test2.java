import java.awt.*;

public class Test2 {
    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        System.out.println(point1);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 100;
        System.out.println(point2);

    }
}
