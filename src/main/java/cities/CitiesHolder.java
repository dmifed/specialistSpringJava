package cities;

import java.util.ArrayList;
import java.util.List;


//Singleton
public class CitiesHolder {
    private List<City> cities;

    private CitiesHolder(){
        cities = new ArrayList<>();
        System.out.println("cities");
    }


    private static final class Holder{
        private static CitiesHolder instance(){
            return new CitiesHolder();
        }
    }

    public CitiesHolder getCitiesHolder(){
        return Holder.instance();
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public boolean addCity(City city){
        if(!cities.contains(city)){
            cities.add(city);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(City c : cities){
            stringBuilder.append(c).append("\n");
        }
        return stringBuilder.toString();
    }
}
