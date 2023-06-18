import java.util.Scanner;

public class Lecture_3D{
    public static void main(String [] args){

        // create da jam scanner
        Scanner jam = new Scanner(System.in);

        System.out.print("Enter letter: ");
        char letter = jam.nextLine().charAt(0);

        switch(Character.toLowerCase(letter)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%c is a vowel.", letter);
                break;
            default:
                System.out.printf("%c is not a vowel.\n", letter);

        }
    }
}