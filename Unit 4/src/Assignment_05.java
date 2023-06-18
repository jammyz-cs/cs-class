import java.util.Scanner;

public class Assignment_05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String menu = """
                ************************
                1) Calculate Diameter
                2) Calculate Circumference
                3) Calculate Area
                ***********************""";
        double pi = 3.1415926535897932384626433832;
        System.out.print("Input a circle's radius: ");
        double radius_of_circle = keyboard.nextDouble();

        System.out.print("Choose one of the following: ");
        System.out.println(menu);

        System.out.print("Choice (1-3): ");
        byte menu_selection = keyboard.nextByte();

        if (menu_selection < 1 || menu_selection > 3) {
            System.out.printf("Bad selection %d is not 1 - 3!%n", menu_selection);
        } else {
            switch (menu_selection) {
                case 1 -> System.out.printf("A %f radius circle has a diameter of %f%n", radius_of_circle, 2 * radius_of_circle);
                case 2 -> System.out.printf("A %f radius circle has a circumference of %f%n", radius_of_circle, 2 * pi * radius_of_circle);
                case 3 -> System.out.printf("A %f radius circle has an area of %f%n", radius_of_circle, pi * radius_of_circle * radius_of_circle);
            }
        }
    }
}
