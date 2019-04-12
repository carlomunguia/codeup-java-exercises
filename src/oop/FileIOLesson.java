//package oop;
//
//import java.io.IOException;
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.nio.file.Files.readAllLines;
//
//public class FileIOLesson {
//    public static void main(String[] args) {
//
//        String directory = "data";
//        String filename = "poemForZion.txt";
//
//        Path dataDirectory =  Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        try {
//            if (Files.notExists(dataDirectory)) {
//                Files.createFile(dataFile);
//            }
//            List<String> fruit = new ArrayList<>();
//            fruit.add("papaya");
//            fruit.add("taro");
//            fruit.add("jazz apples");
//            fruit.add("disco berry");
//            Files.write(dataFile, fruit);
//        }
//        } catch (IOException ioe) {
//            System.out.println(ioe);
//        }
//    }
//}
//
