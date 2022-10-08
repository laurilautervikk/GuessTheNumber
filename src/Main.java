import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player = new Player(0, 0);
        Game game = new Game(0);

        //get upper limit and generate random number

        System.out.println("Set an upperLimit for the game (greater than 1): ");
        game.upperLimit = sc.nextInt();
        game.generateRandom(); //not working

        System.out.println("random " + game.randomNum);
        System.out.println("limit " + game.upperLimit);

        //evaluate guess
        while (game.randomNum != player.guess) {
            String message = "";
            player.attempts ++ ;
            if (player.guess < game.randomNum && player.guess > 0){
                message ="greater than " + player.guess;
            } else if (player.guess > game.randomNum && player.guess < game.upperLimit){
                message = "smaller than " + player.guess;
            } else if (player.guess < 0 || player.guess > game.upperLimit) {
                message = "out of range "; //0 will pass, otherwise say 'out of range' at the start
            }
            System.out.println(message);
            //continue to prompt for input
            System.out.println("Guess a number between 1 and " + game.upperLimit + ": ");
            player.guess = sc.nextInt();
        }

        //display end result
        System.out.println("Correct!");
        System.out.println("It took you " + player.attempts + " attempt(s): " + player.rateResult());

    }
}
