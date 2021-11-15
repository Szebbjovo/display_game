import java.awt.*;
import java.awt.image.BufferedImage;

public class CsunyaEnemy extends GameObject {
    
    public CsunyaEnemy(){
        size = new Size(
            (int)Math.floor(Math.random()*(800-200+1)+200),
            (int)Math.floor(Math.random()*(800-200+1)+200)
        );
    }

    @Override
    public void update(){
        position = new Position((int) position.getX() - 1 ,(int) position.getY() );
    }

   @Override
    public Image getSprite(){
        BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, this.size.getHeight(),this.size.getWidth());

        graphics.dispose();

        return image;
    }
}
