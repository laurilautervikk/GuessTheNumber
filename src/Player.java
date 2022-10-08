

public class Player {

    int attempts = 0, guess = 0;
    public String rating = "okay";


    public Player(int attempts, int guess) {

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
