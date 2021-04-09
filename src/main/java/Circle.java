/**
 * @author dmifed
 */
public class Circle extends Graphic {
    private Pivot center;
    private double radius;
    private String color;

    public Circle(Pivot center, double radius, String color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Circle(Pivot center, double radius) {
        this.center = center;
        this.radius = radius;
        this.color = "Black";
    }

    public Pivot getCenter() {
        return center;
    }

    public void setCenter(Pivot center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.printf("Circle radius %f, at %d,%d, color: %s \n", radius, center.getX(), center.getY(), color);
    }
}
