import java.util.Scanner;

public class Guided_Practice_10{
    public static final int SPEED_LIMIT = 60;
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed_miles_per_hour = keyboard.nextInt();

        boolean is_speeding = speed_miles_per_hour > SPEED_LIMIT;
    }
}