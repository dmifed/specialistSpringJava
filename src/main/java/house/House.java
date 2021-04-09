package house;

import javafx.beans.NamedArg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * @author dmifed
 */
@Component
public class House {
    @Autowired
    @Qualifier("logBean")
    private Material wall;
    private static int ids = 0;
    private int id;
    @Value("First")
    private String name;
    @Value("3")
    private int floors;

    public void setWall(Material wall) {
        this.wall = wall;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @PostConstruct
    public void init(){
        this.id = ++ids;
        //this.name = "House";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +"#" + name + " at: " + floors + " floors:";
    }

    public void buildHouse(){
        System.out.print(toString() + " ");
        for(int i = 0; i < floors; i++){
            System.out.print("floor#" + i + ": ");
            wall.build();
        }
        System.out.println();
    }
}
