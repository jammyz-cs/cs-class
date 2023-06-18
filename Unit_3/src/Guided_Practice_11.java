import java.util.Scanner;

public class Guided_Practice_11 {
    public static final int SPEED_LIMIT = 60;
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ebter speed: ");
        int speed_miles_per_hour = keyboard.nextInt();

        boolean is_speeding = speed_miles_per_hour > SPEED_LIMIT;

        //   condition ? value if condition is true : value if condition is false
        String scan_result = is_speeding    ? "Speed ticket." : "no Ticket";

        /* original conditional statement
        if(is_speeding){
            scan_result = "Speeding ticket";
        }
        else{
            scan_result = "No ticket";
        }
        */
        System.out.println();
        System.out.printf("Car Speed: %d mph%n", speed_miles_per_hour);
        System.out.printf("Result   : %s%n", scan_result;

    }
}
