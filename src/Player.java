

public class Player {

    int attempts = 0, guess;
    private String rating = "okay";

    public Player(int attempts, int guess) {
        attempts = attempts;
        guess = guess;
    }

    public String rateResult() {
        if( attempts < 5){
            rating = "very good";
        } else if (attempts < 7) {
            rating = "decent";
        }
        return rating;
    }

}
