package cities;

import java.time.LocalDate;

public class City {
    private int population;
    private LocalDate founding;
    private String name;
    private static int ids = 0;
    private int id;

    public void init(){
        id = ++ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    private String getFoundation(){
        return founding.getDayOfMonth() + " " +
                founding.getMonth().toString().toLowerCase() + " " +
                founding.getYear();
    }

    @Override
    public String toString() {
        return "#" + id + " " + name + ", population: " + population + ", founding: " + getFoundation();    }

    public int getPopulation() {
        return population;
    }
    @SuppressWarnings("unused")
    public void setPopulation(int population) {
        this.population = population;
    }

    public LocalDate getFounding() {
        return founding;
    }
    @SuppressWarnings("unused")
    public void setFounding(LocalDate founding) {
        this.founding = founding;
    }

    public String getName() {
        return name;
    }
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    public void unUsedMethodTest(){

    }
}
