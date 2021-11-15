public class szintjelzo {
        //public static int lvl = 1;
        void lvlUpdate(boolean almaCatch,boolean enemyHIT, int lVL){
            if(almaCatch == true){
                lVL++;
            }
            else if(enemyHIT == true){
                lVL--;
            }
        }
    
}
