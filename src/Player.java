

public class Player {

    int attempts = 0;
    String rating = "okey";

    public Player(int attempts) {
        attempts = attempts;
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
