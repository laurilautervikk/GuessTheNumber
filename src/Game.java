import java.util.Random;


public class Game {

    public int upperLimit = 1;
    public int randomNum = 0;


    public Game(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int generateRandom() {
        Random  r = new Random();
        int randomNum = r.nextInt(upperLimit);
        return randomNum;
    }
}
