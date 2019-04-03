//package playable;
//
//import javax.swing.*;
//import java.util.*;
//
//import java.util.stream.IntStream;
//
//public class Mappy {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        String name = "Goro";
//        String wName = name + " Majima";
//        wName += " is my name";
//        String majimaSword = "Great" + 22;
//
//        System.out.println(wName.compareTo("ABC"));
//
//        System.out.println(wName.substring(0, 5));
//
//        for (String x : wName.split(" ")) System.out.println(x);
//
//        StringBuilder sb = new StringBuilder("Im a String Builder Yo");
//        System.out.println(sb.length());
//        sb.append(" Yeah");
//        System.out.println(sb.insert(6, "Big "));
//
//        int[] a1 = new int[10];
//        a1[0] = 1;
//        Arrays.fill(a1, 2);
//        System.out.println(a1[0]);
//
//        int[] oneToTen = IntStream.rangeClosed(1, 10).toArray();
//
//        for (int x : oneToTen) System.out.println(x);
//
//        int a3[][] = new int[2][2];
//        String[][] a4 = {{"00", "10"},
//                {"01", "11"}};
//
//        int a6[] = {1, 2, 3, 4};
//        int a7[] = Arrays.copyOf(a6, 3);
//        System.out.println(Arrays.equals(a6, a7));
//
//        ArrayList<String> aL1 = new ArrayList<String>(20);
//        aL1.add("Sue");
//        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        for (Integer x : aL2) System.out.println(x);
//        System.out.println(aL2.get(1));
//
//        aL2.set(1, 5);
//        aL2.remove(3);
//
//        Iterator it = aL2.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//            LinkedList<Integer> iL1 = new LinkedList<Integer>();
//            iL1.add(1);
//            iL1.add(2);
//            iL1.add(3);
//            iL1.addAll(Arrays.asList(1, 2, 3, 4));
//            iL1.addFirst(0);
//
//            int secretNum = 7;
//            int guess = 0;
//
//            do {
//                System.out.println("Guess : ");
//                if (sc.hasNextInt()) {
//                    guess = sc.nextInt();
//                }
//            } while (secretNum != guess);
//            System.out.println("You guessed it");
//
//
//
//
//        }
//    }
//}
