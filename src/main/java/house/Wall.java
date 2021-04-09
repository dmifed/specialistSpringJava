package house;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author dmifed
 */
@Component("logBean")
public class Wall implements Material {
    @Value("logs")
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
}
