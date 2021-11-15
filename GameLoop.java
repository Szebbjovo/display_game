import java.io.FilterInputStream;
import java.util.Currency;

public class GameLoop implements Runnable{

    private Game game;

    private boolean futas;
    private final double frissitesiRata = 1.0d/75.0d;

    private long nextStatTime;
    private int fps, ups;

    public GameLoop(Game game){
        this.game = game;
    }

    @Override
    public void run(){
        futas = true;
        double accumlator = 0;
        long curentTime, lastUpdate = System.currentTimeMillis();
        nextStatTime = System.currentTimeMillis() + 1000;

        while(futas){
            curentTime = System.currentTimeMillis();
           double lastRenderTimeInSecounds = (curentTime - lastUpdate) / 1000d;
            accumlator += lastRenderTimeInSecounds;
            lastUpdate = curentTime;

         if(accumlator >= frissitesiRata)   {
         while(accumlator > frissitesiRata){
              update();
              accumlator -= frissitesiRata;
           }
            render();
        }
        printStats();
        }   
    }

    private void printStats(){
        if(System.currentTimeMillis() > nextStatTime){
            System.out.println(String.format("FPS: %d, UPS: %d", fps, ups));
            fps = 0;
            ups = 0;
            nextStatTime = System.currentTimeMillis() + 1000;
        }
    }

    private void update(){
        game.update();
        ups++;
    }


    private void render(){
        game.render();
        fps++;
    }



}