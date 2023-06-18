import java.util.Scanner;

public class Lecture_3B{
    public static void main(String [] argss){
        // Write a program that will square an odd number entered and cube an even number.

        // Let's try solving the problem using if-else statements first.

        // Create scanner object called jam :3
        Scanner jam = new Scanner(System.in);

        // Ask user to enter integer
        System.out.print("Enter an integer: ");

        // Store number in user_num
        int user_num = jam.nextInt();

        /* Begin conditional statements. If a number is even, it is evenly divisble by 2, that is
        there is no remainder when you divide the integer by 2. So let's first check if the remainder
        of our integer is 0 when we divide by 2.
         */

        // If even, cube user_num
        if(user_num % 2 == 0){
            System.out.printf("%d is even, output : ", user_num);
            user_num = user_num*user_num*user_num;
            System.out.println(user_num);
        }
        // If user_num%2 == 0 is False, the number is odd and we square the result
        else{
            System.out.printf("%d is odd, output : ", user_num);
            user_num = user_num*user_num;
            System.out.println(user_num);
        }

        // you can also do this using ternary operator
        /*

        user_num % 2 == 0 ? System.out.printf("%d is even, output : %d\n", user_num, user_num*user_num*user_num) : System.out.printf("%d is odd, output : %d\n", user_num, user_num*user_num);
         */
    }
}
