import java.util.Scanner;

public class GuessGame {
    
    public static void main(String[] args){
        
        int secret = 1 + (int) (Math.random() * 100 );

        System.out.print("I'm thinking of a number");
        System.out.println("between 1 and 100");

        Scanner userInput = new Scanner( System.in );

        int guess = 0;

        while(guess != secret) {
            
            System.out.print("What's your guess? ");
            guess = userInput.nextInt();

            if (guess == secret) System.out.println("You win!");
            if (guess > secret) System.out.println("Too High");
            if (guess < secret) System.out.println("Too Low");
        }
    }
}
