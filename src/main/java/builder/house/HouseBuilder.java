package builder.house;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dmifed
 */
public class HouseBuilder {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("builder");
        House house = context.getBean(House.class);
        house.buildHouse();
    }
}
