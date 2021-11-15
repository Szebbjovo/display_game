//import game.state.State;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.Position;



public class Game{

    private Display display;
    private List<GameObject> gameObjects;
    private Input input;

    public Game(int width, int height){
        
        input = new Input();

        display = new Display(width, height, input);
      
        gameObjects = new ArrayList<>();
        gameObjects.add(new Square(new PlayerController(input)));
        gameObjects.add(new CsunyaEnemy());


    }

    public void update(){
        gameObjects.forEach(gameObjects -> gameObjects.update());
       // handleCollisions(state);
    }

  /*  public List<GameObject> getCollidingGameObjects(GameObject entity){
        return gameObjects.stream()
            .filter(other -> other.collidesWith(gameObject)
            .collect(Collect(Collectors.toList())));
    }
    */
    /*
    private void handleCollisions(State state){
        state.getCollidingGameObjects(this).forEach(this::handleCollision);
    }
*/
  /*  protected abstract void handleCollision(GameObject other);*/
/*
    @Override
    public boolean collidesWith(GameObject other) {
        return getCollisionBox().collidesWith(other.getCollisionBox());
    }
*/
   /* @Override
    public CollisionBox getCollisionBox() {
        return new CollisionBox(
            new Rectangle(
                position.intX(),
                position.intY(),
                size.getWidth(),
                size.getHeight()
            )
        );
    }*/

    public void render() {
        display.render(this);
    }
    
    public List<GameObject> getGameObjects(){
        return gameObjects;

    }


}
