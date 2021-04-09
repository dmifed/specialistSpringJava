package house;

import cities.CitiesHolder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dmifed
 */
//@ComponentScan
public class HouseBuilder {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        House house = context.getBean(House.class);
        house.buildHouse();
    }
}
