import java.awt.*;
import java.awt.image.BufferedImage;
////import java.lang.ModuleLayer.Controller;
//import java.util.ResourceBundle.Control;

public class Square extends GameObject {
    
    private Controller controller;

    int igenx = 0;
    int nemy = 0;

    public Square(Controller controller){
        super();
        this.controller = controller;
    }

    @Override
    public void update(){


        if(controller.isRequestingUp()){
            this.nemy--;
        }

        if(controller.isRequestingDown()){
            this.nemy++;
        }

        if(controller.isRequestingLeft()){
            this.igenx--;
        }

        if(controller.isRequestingRight()){
            this.igenx++;
        }
        
        position = new Position((int) position.getX() +  this.igenx,(int) position.getY() +  this.nemy);
            
    }

    @Override
    public Image getSprite(){
        BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, size.getHeight(),size.getWidth());

        graphics.dispose();

        return image;
    }
}
