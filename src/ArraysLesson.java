import java.util.Scanner;

public class ArraysLesson {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Please choose an Epoxy Grout!");

        String [] grouts = new String[6];

        grouts[0] = "BASF 928 Master Grout";
        grouts[1] = "Sika 100 All Purpose Grout";
        grouts[2] = "Adeka P201 Non-Bentonite Water Stop";
        grouts[3] = "BASF Masterflow 100 Grout";
        grouts[4] = "WR Meadows ClearALL Urethane";
        grouts[5] = "Five Star 2 Part Epoxy Grout";

        String groutChoice = s.findAll(grouts);
        System.out.println("Your Grout is " + groutChoice);
    }
}
