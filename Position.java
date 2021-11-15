public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        if(x < 1000){
            if(x > 0){
            return x;
            }
            else{
                return x + 1000;
            }
        }
        else {
        return x - 900;
        }
    }

    public int getY(){

        if(y < 1000){
            if(y > 0){
            return y;
            }
            else{
                return y + 1000;
            }
        }
        else {
        return y - 900;
        }
    }
}
