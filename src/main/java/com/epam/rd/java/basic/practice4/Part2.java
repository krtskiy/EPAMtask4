package com.epam.rd.java.basic.practice4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        System.out.println(writeTenRandomNumbersToFile());
        System.out.println(sortRandomNumberFromFile());
    }

    private static String randomUnsorted = "part2.txt";
    private static String randomSorted = "part2_sorted.txt";

    private static String writeTenRandomNumbersToFile() {
        StringBuilder numbers = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(randomUnsorted));
            for (int i = 0; i < 10; i++) {
                int rand = secureRandom.nextInt(50);
                numbers.append(rand).append(" ");
            }
            fileWriter.write(numbers.toString());
            fileWriter.close();

//            PrintWriter pw = new PrintWriter(randomUnsorted);
//            for (int i = 0; i < 10; i++) {
//                int rand = secureRandom.nextInt(50);
//                numbers.append(rand).append(" ");
//            }
//            pw.print(numbers);
//            pw.close();
        } catch (Exception e) {
            e.printStackTrace(); //NOSONAR
        }
        String result = "input ==> ";
        return result + Demo.readFile(randomUnsorted);
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
        System.out.println(result + Demo.readFile(randomUnsorted)); //NOSONAR

    }


}
