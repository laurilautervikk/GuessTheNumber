import java.util.Random;


public class Game {

    public int upperLimit = 1;
    public int randomNum = 0;


    public Game(int upperLimit) {
        this.upperLimit = upperLimit;

    }

    public void generateRandom() {
        Random  rand = new Random();
        randomNum = rand.nextInt(upperLimit - 1) + 2;
    }
}
