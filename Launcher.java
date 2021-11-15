import java.awt.*;

public class Launcher {

    public static void main(String[] args){
    
        //Display display = new Display(800, 600);
        new Thread(new GameLoop(new Game(1000, 800))).start();



        //karakter setup
        int hp = 100;
        int lvl = 1;
        String karakterNev;
        boolean enemyHit = false;
        boolean almaCatcH = false;
        boolean fallingDMg = false;
        boolean suicideBUTTon = false;



    }
}  