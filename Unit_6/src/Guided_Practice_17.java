import java.util.Scanner;
import java.util.Random;
public class Guided_Practice_17 {
    public static final int MIN_LETTER = 97;
    public static final int MAX_LETTER = 122;
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();


        // 10 random lower case letters
        for(int i = 0; i < 10; i++) {
            // find number in [97, 122]
            int letter_index = rnd.nextInt((MAX_LETTER - MIN_LETTER) + 1) + MIN_LETTER;

            // convert number to character
            char letter = (char)(letter_index);

            //print character
            System.out.println(letter);
        }

        // rnd.nextInt((max-min)+1)+min;
        // lowercase a = 97, z = 122
    }
}
