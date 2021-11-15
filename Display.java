import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


public class Display extends JFrame {

    private Canvas c;
    
 
    public Display(int width, int height, Input input){
        setTitle("Szuper Ferenc a felfedezo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = new Canvas();
        c.setPreferredSize(new Dimension(width, height));
        c.setFocusable(false);
        add(c);
        addKeyListener(input);
        pack();

        c.createBufferStrategy(3);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void render(Game game){

        BufferStrategy bufferStrartegy = c.getBufferStrategy();

        Graphics graphics = bufferStrartegy.getDrawGraphics();

        graphics.setColor(Color.blue);
        graphics.fillRect(0, 0, c.getWidth(), c.getHeight());

        game.getGameObjects().forEach(gameObject -> graphics.drawImage(
            gameObject.getSprite(),
            gameObject.getPosition().getX(),
            gameObject.getPosition().getY(),
            null
        ));

        graphics.dispose();
        bufferStrartegy.show();
    }

}
