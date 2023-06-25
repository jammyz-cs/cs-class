import java.util.Scanner;
public class Assignment_10 {
    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        System.out.print("Start counting tickets? (y\\n) ");

        char input = in.next().charAt(0);

        // "To keep thing simple, the loop should stop counting tickets on anything but y or Y."
        // We sent count_tickets to true if the input is Y and false if not.
        boolean count_tickets = (input == 'Y' || input == 'y' ? true : false);


        int attendee_count = 0, green_tickets = 0, blue_tickets = 0;

        while(count_tickets){
            System.out.print("Enter b for blue or g for green: ");
            input = in.next().charAt(0);
            if(input == 'b' || input == 'B'){
                blue_tickets++;
                attendee_count++;
            }
            else if(input == 'g' || input == 'G'){
                green_tickets++;
                attendee_count++;
            }
            else{
                System.out.println(input + " is not a valid input. Enter b or g!");
            }
            System.out.print("Count another ticket? (y\\n): ");
            input = in.next().charAt(0);
            if(input == 'Y' || input == 'y'){
                // if input is Y, count_tickets will stay true

               count_tickets = true;
            }
            else{
                count_tickets = false;
            }
        }

        System.out.printf("There were %d attendees.    ", attendee_count);
        System.out.printf("%d had blue tickets and %d had green tickets.%n", blue_tickets, green_tickets);
    }
}
