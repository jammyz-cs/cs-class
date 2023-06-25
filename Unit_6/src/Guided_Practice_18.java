import java.util.Scanner;
import java.util.Random;
// while loop
public class Guided_Practice_18 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Guess a number between 1 and 10: ");
        int count = 1;
        int guess = in.nextInt();

        int num = rnd.nextInt(10) + 1;
        while(guess != 999) {
            // restart count if the player wants to play again
            count = 1;
            while (guess != num) {
                System.out.println("Guess a number between 1 and 10: ");
                guess = in.nextInt();
                count++;
            }
            System.out.println("It took " + count + " guesses to guess correctly.");

            // using variable "guess" again since inputs range from 1-10
            // and the practice does not specify to create parameters against this.
            System.out.println("Do you want to play again? (Enter 999 if no)");
            guess = in.nextInt();
        }

    }
}
