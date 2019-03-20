
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 8;
        int myNumber = 18;
        long morePrecise = myNumber;
        var myString = (3.1453);
        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println("Hello, World!");
        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        System.out.println(morePrecise);
//        System.out.format("!, $$", message, name);

        double Zion = (31f/21f);
//        zion = "Zion";

        System.out.println("Hello" + "!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }
}