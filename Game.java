import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

//😂😂😂😂
public class Game{

    private Display display;
    private List<GameObject> gameObjects;

    public Game(int width, int height){
        display = new Display(width, height);
      
        gameObjects = new ArrayList<>();
        gameObjects.add(new Square());

    }

    public void update(){
        gameObjects.forEach(gameObjects -> gameObjects.update());
    }

    public void render() {
        display.render(this);
    }
    
    public List<GameObject> getGameObjects(){
        return gameObjects;

    }


}
