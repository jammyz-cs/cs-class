import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args){
        // create scanner object
        Scanner in  = new Scanner(System.in);

        // Ask user for ending number
        System.out.print("Enter a number: ");
        int ending_num = in.nextInt();

        // start loop

        // loop will make pairs x, y
        for(int x = ending_num; x > 0; x--){
            // unique pairs start when x = y and and decrement y until it's equal to 1
            for(int y = x; y > 0; y--){
                System.out.printf("%d, %d%n", x, y);
            }
            // separate blocks of pairs
            System.out.print("\n");
        }

    }
}
