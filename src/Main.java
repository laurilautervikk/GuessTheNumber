import java.util.Scanner;

public class Main {
    //ask upper limit
    //ask number p1
    //give feedback
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Game game = new Game(0);
        Player player = new Player(0, 0);



        //1. generate random - not needed?
        //game.generateRandom();

        //2. ask for a guess
//        while (game.randomNum != guess) {
//            attempts ++ ;
//            if (guess < randomNum && guess > 0){
//                System.out.println("greater than " + guess);
//            } else if (guess > randomNum && guess < upperLimit){
//                System.out.println("smaller than " + guess);
//            } else if (guess < 0 || guess > upperLimit) {
//                System.out.println("out of range "); //0 will pass, otherwise say 'out of range' at the start
//            }
//            //continue to prompt for input
//            System.out.println("Guess a number between 1 and " + upperLimit + ": ");
//            guess = sc.nextInt();
//        }

        //0. ask for upper limit
        System.out.println("Set an upperLimit for the game (greater than 1): ");
        game.upperLimit = sc.nextInt();

        String message = "Upper limit %s, generateRandom() %s".formatted(game.upperLimit, game.generateRandom());
        System.out.println(message);



    }
}
