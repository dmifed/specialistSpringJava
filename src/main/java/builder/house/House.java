package builder.house;

/**
 * @author dmifed
 */
public class House {
    private Material wall;
    private static int ids = 0;
    private int id;
    private String name;
    private int floors;

    public void setWall(Material wall) {
        this.wall = wall;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

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

    public House(Material wall, String name) {
        this.wall = wall;
        this.name = name;
    }
}
