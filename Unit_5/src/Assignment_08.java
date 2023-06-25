import java.util.Scanner;

public class Assignment_08 {
    public static void main(String[] args){
        // still need to edit teh output format dont submit yet :3

        // make border
        String border_symbol = "~";
        int border_length = 47;
        String border = border_symbol.repeat(border_length);

        // make scanner
        Scanner in = new Scanner(System.in);

        System.out.println(border);
        System.out.println("This program outputs a table of powers.");
        System.out.println(border);

        System.out.print("Enter the max base    : ");
        int max_base = in.nextInt();

        System.out.print("Enter the max exponent: ");
        int max_exp = in.nextInt();
        // System.out.print(row * col + "\t");
        double ans;

        // double space from input
        System.out.print("\n\n");
        for(int curr_base = 1; curr_base <= max_base; curr_base++){
            if(curr_base == max_base){
                // start border for final output
                System.out.println(border);
            }
            for(int curr_exp = 1; curr_exp <= max_exp; curr_exp++){
                ans = Math.pow(curr_base, curr_exp);
                System.out.printf("%d^%d = %.1f" + "  ", curr_base, curr_exp, ans);
            }
            // close border for final output
            if(curr_base == max_base){
                System.out.print("\n" + border);
            }
            else{
                System.out.print("\n");
            }
        }


    }
}
