import java.awt.*;


public abstract class GameObject {
    protected Position position;
    protected Size size;



    public GameObject(){
    position = new Position(0,0);
    //kicsit felesleges, de innen is lehet meretet modositani
    size = new Size(60,800);
    }

    public abstract void update();
    public abstract Image getSprite();


    public Position getPosition(){
        return position;
    }

    public Size getSize(){
        return size;
    }
}
