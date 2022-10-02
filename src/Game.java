import java.util.Random;


public class Game {

    public int upperLimit = 1, randomNum = 0;


    public Game(int upperLimit) {
        upperLimit = upperLimit;

    }

    public void generateRandom() {
        Random  r = new Random(); //instance of random class
        int randomNum = r.nextInt(upperLimit);
    }

}
