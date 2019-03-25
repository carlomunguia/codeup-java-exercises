import java.util.Scanner;
import java.util.Random;

public class RollDice {

    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

    public static String rollDice(int sides) {
        return String.format("%d and %d", rollDie(sides), rollDie(sides));
    }

    public static void processDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number of sides for the dice");
        int sides = getInteger(1, 50);

        do {
            System.out.println("Rolling dice...");
            System.out.println("You rolled " + rollDice(sides));
            System.out.println("Do you wish to roll again [y/n]?");
        } while (sc.next().equals("y"));
    }
}


