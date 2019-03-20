import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int num = scanner.nextInt();
        System.out.format("You entered %d%n", num);

        System.out.print("Please enter 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        String random = scanner.nextLine();

        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence: %s%n", sentence);
        System.out.format("Here is the random variable: %s%n", random);
    }
}