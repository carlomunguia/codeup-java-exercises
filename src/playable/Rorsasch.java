//package playable;
//
//import java.util.*;
//import java.util.stream.IntStream;
//
//public class Rorsasch {
//
//    static Scanner sc = new Scanner(System.in);
//
//    public static int getSum(int x, int y) {
//        return x + y;
//    }
//
//    public static void changeMe(int cNum) {
//        cNum = 10;
//    }
//
//    public static int getSum2(int... nums) {
//        int sum = 0;
//        for (int x : nums) {
//            sum += x;
//        }
//        return sum;
//    }
//
//    static int factorial(int num) {
//        if (num == 1) {
//            return 1;
//        } else {
//            int result = num * factorial(num - 1);
//            return result;
//        }
//    }
//
//    public enum Day {Monday, Tuesday, Wednesday}
//
//    public static void main(String[] args) {
//
//        try {
//            int badInt = 10 / 0;
//        } catch (ArithmeticException ex) {
//            System.out.println("Can't divide by Zero");
//            System.out.println(ex.getMessage());
//            System.out.println(ex.toString());
//        }
//    }
//}
