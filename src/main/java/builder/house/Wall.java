package builder.house;


/**
 * @author dmifed
 */
public class Wall implements Material {
    String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wall of " + material;
    }

    @Override
    public void build() {
        System.out.print(toString() + "; ");
    }

    public Wall(String material) {
        this.material = material;
    }
}
