package cities;

/**
 * @author dmifed
 */
public class SimpleCity {
    private int population;
    private String name;

    public SimpleCity(int population) {
        this.population = population;
        this.name = "Simple";
    }

    @Override
    public String toString() {
        return name + ", population: " + population;    }
}
