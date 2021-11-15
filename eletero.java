public class eletero {
    //public static int hp= 150;

    void hpUpdate(boolean enemyHIT, boolean fallDMG, boolean suicideBUTTON, int hP){
        if(enemyHIT== true){
            hP =- 25;
        }

        if(fallDMG == true){
            hP =- 10;
        }

        if(suicideBUTTON == true){
            System.out.println("Wanna talk about ? 'also here`s some extra hp, keep up king <3'");
            hP =+ 50;
        }
    }

}
