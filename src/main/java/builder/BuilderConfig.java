package builder;

import builder.house.House;
import builder.house.Material;
import builder.house.Wall;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

/**
 * @author dmifed
 */
@Configuration
public class BuilderConfig {

    @Bean
    public House house(){
        House house = new House(wall(), houseName());
        house.setFloors(5);
        return house;
    }

    @Bean
    @Scope("prototype")
    public Material wall(){
        return new Wall(material());
    }

    @Bean
    public String material(){
        return "Bricks";
    }

    @Bean("name")
    public String houseName(){
        return "JavaHouse";
    }
}
