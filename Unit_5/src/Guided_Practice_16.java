import java.util.Scanner;

public class Guided_Practice_16 {

        public static void main(String[] args){
            Scanner in  = new Scanner(System.in);
        /*
        int count;

        System.out.print("How many numbers do you want to enter? ");
        count = in.nextInt();

        int num, sum = 0;

        for(int i= 0; i < count ; i++){
            System.out.println("Enter a number: ");
            num = in.nextInt();
            sum += num;
        }
        */

            // Make 9x9 multiplication table
            for(int row = 0; row < 10; row++){

                for(int col = 0; col < 10; col++){
                    if(row > 0 && col > 0){
                        System.out.print(row * col + "\t");
                    }
                    else{
                        System.out.print(row + col + "\t");
                    }
                }

                System.out.println("\n");
            }
            //System.out.println("The sum of the numbers is " + sum);
    }

}
