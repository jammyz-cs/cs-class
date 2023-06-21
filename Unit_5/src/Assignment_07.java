import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args){
        // create scanner object
        Scanner in  = new Scanner(System.in);

        // Ask user for ending number
        System.out.print("Input an ending number: ");
        int num = in.nextInt();

        // start loop
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.printf("(%d, %d)%n", i, j);
            }
        }

    }
}
