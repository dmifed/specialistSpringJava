import java.awt.*;

/**
 * @author dmifed
 */
public class Point extends Graphic {
    private Pivot point;

    public Point(Pivot point) {
        this.point = point;
    }

    public Pivot getPoint() {
        return point;
    }

    public void setPoint(Pivot point) {
        this.point = point;
    }

    @Override
    public void print() {
        System.out.printf("Point at %d,%d \n", point.getX(), point.getY());
    }
}
