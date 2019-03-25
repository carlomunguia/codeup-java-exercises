import java.util.Scanner;

public class BluePinkMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playerCharacter = true;

        String message = "You have arrived at the base of a Blue Pink Mountain\n" +
                "The ground around you is soft green grass and your'e at a terrace center square";
        System.out.println(message);
        System.out.println();

        do {
            System.out.println("Which direction? Enter command:");
            String bluePink = scanner.nextLine();
        }while(playerCharacter);
    }
}

