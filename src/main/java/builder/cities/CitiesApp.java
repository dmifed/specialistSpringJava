package builder.cities;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dmifed
 */
public class CitiesApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CitiesHolder citiesHolder = context.getBean(CitiesHolder.class);
        System.out.println(citiesHolder);
    }
}
