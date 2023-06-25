import java.util.Scanner;

public class Assignment_09 {
    static final double LOW_TEMP = -130.0;
    static final double HIGH_TEMP = 130.0;
    static final int SENTINEL = 999;

    public static void main(String[] args){
        // create scanner object
        Scanner in  = new Scanner(System.in);

        short curr_temp;
        double total_temp = 0;
        int count  = 0;
        /* The purpose of this program is to ask the user for a series of daily low temperatures and
        calculate the average temperature based on the number of inputs. The loop will stop when the
        user inputs the value 999. If the input, curr_temp, is greater than 130 or less than -131,
        we will print a message indicating that the temperature is not in range.
        */
        System.out.println("This program allows you to input daily low temperatures");
        do{
            System.out.print("Enter temperature -130 to 130 (999 to Quit): ");
            curr_temp = in.nextShort();
            if(curr_temp > HIGH_TEMP || curr_temp < LOW_TEMP){
                System.out.printf("%d is not between -130 and 130.%n", curr_temp);
            }
            else{
                total_temp += curr_temp;
                count+=1;
            }
        }while(curr_temp != SENTINEL);
        System.out.println("Calculating average temperature...");
        if(count == 0){
            System.out.print("0 temperatures entered, so no average calculated.\n");
        }
        else{
            double average_temperature = total_temp / count;
            System.out.printf("%d temperatures entered, average temperature is %.1f.%n", count, average_temperature);
        }
    }
}
