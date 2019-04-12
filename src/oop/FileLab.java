//package oop;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileLab {
//    public static void main(String[] args) {
//
//        String directory = "industrial";
//        String filename = "stdchemicals.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        try {
//            if (Files.notExists(dataDirectory)) {
//                Files.createDirectories(dataDirectory);
//            }
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile);
//            }
//
//            List<String> chemicals = new ArrayList<>();
//            chemicals.add("sulfuric acid");
//            chemicals.add("nitrogen");
//            chemicals.add("ethylene");
//            chemicals.add("oxygen");
//            chemicals.add("propylene");
//            chemicals.add("chlorine");
//            chemicals.add("ethylene dichloride");
//            chemicals.add("phosphoric acid");
//            chemicals.add("ammonia");
//            chemicals.add("sodium hydroxide ");
//            Files.write(dataFile, chemicals);
//
//            List<String> lines = Files.readAllLines(dataFile);
//            for (String line: lines) {
//                System.out.println(line);
//            }
//        }catch (IOException, ioe) {
//            System.out.println(ioe);
//        }
//        System.out.println("finished");
//    }
//
//
//
//
//}
