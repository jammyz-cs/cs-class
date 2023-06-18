import java.util.Scanner;


public class Guided_Practice_09{
    public static final int SYSTOLIC_THRESHOLD = 120;
    public static final int DIASTOLIC_THRESHOLD = 80;
    public static void main(String [] args){
        // create da jam scan
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Systolic pressure: ");
        int systolic_pressure = keyboard.nextInt();

        System.out.print("Enter Diastolic pressure: ");
        int diastolic_pressure = keyboard.nextInt();

        // warning check

        String systolic_pressure_warning = "";
        if(systolic_pressure > SYSTOLIC_THRESHOLD){
            systolic_pressure_warning = "Systolic BP is elevated.";
        }

        String diastolic_pressure_warning = "";
        if(diastolic_pressure > DIASTOLIC_THRESHOLD){
            diastolic_pressure_warning = "Diastolic BP is elevated.";
        }

        // output
        System.out.println();
        System.out.printf("Blood Pressure: %d / %d%n", systolic_pressure, diastolic_pressure);

        // check if warnings have string, that is, they are not empty, meaning that we use the
        // ! operator
        if(!systolic_pressure_warning.isEmpty()){
            System.out.println(systolic_pressure_warning);
        }
        if(!diastolic_pressure_warning.isEmpty()){
            System.out.println(diastolic_pressure_warning);
        }
    }
}