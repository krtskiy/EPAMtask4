package com.epam.rd.java.basic.practice4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        writeTenRandomNumbersToFile();
        demonstrateUnsorted();
        sortRandomNumberFromFile();
        demonstrateSorted();
    }

    private static String randomUnsorted = "part2.txt";
    private static String randomSorted = "part2_sorted.txt";

    private static void writeTenRandomNumbersToFile() {
        StringBuilder numbers = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(randomUnsorted), "cp1251"));
            for (int i = 0; i < 10; i++) {
                int rand = secureRandom.nextInt(50);
                numbers.append(rand).append(" ");
            }
            writer.write(numbers.toString());
            writer.close();

//            PrintWriter pw = new PrintWriter(randomUnsorted);
//            for (int i = 0; i < 10; i++) {
//                int rand = secureRandom.nextInt(50);
//                numbers.append(rand).append(" ");
//            }
//            pw.print(numbers);
//            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String sortRandomNumberFromFile() {
        StringBuilder numbers = new StringBuilder();
        List<Integer> inputSet = new ArrayList<>();
        String input = Demo.readFile(randomUnsorted);
        String[] inputArr = input.split(" ");
        for (String s : inputArr) {
            inputSet.add(Integer.parseInt(s));
        }
        try {
            Collections.sort(inputSet);
            for (Integer numbs : inputSet) {
                numbers.append(numbs).append(" ");
            }
            PrintWriter pw = new PrintWriter(randomSorted);
            pw.print(numbers);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //NOSONAR
        }
        String result = "output ==> ";
        return result + Demo.readFile(randomSorted);

    }

    private static void demonstrateUnsorted() {
        String result = "input ==> ";
        System.out.println(result + Demo.readFile(randomUnsorted));

    }

    private static void demonstrateSorted() {
        String result = "output ==> ";
        System.out.println(result + Demo.readFile(randomSorted));
    }


}
