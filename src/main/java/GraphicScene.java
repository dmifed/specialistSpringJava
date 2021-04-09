import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author dmifed
 */
public class GraphicScene {
    private List<Graphic> graphics;

/*    public GraphicScene(List<Graphic> graphics) {
        this.graphics = graphics;
    }*/

    public List<Graphic> getGraphics() {
        return graphics;
    }

    public void setGraphics(List<Graphic> graphics) {
        this.graphics = graphics;
    }

    public void print(){
        for(Graphic gr : graphics){
            gr.print();
        }
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GraphicScene gr = context.getBean("SceneBean", GraphicScene.class);
        gr.print();
    }
}
