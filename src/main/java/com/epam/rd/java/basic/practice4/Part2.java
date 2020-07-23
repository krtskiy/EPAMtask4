package com.epam.rd.java.basic.practice4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
            PrintWriter pw = new PrintWriter(randomUnsorted);
            for (int i = 0; i < 10; i++) {
                int rand = secureRandom.nextInt(50);
                numbers.append(rand).append(" ");
            }
            pw.print(numbers);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void sortRandomNumberFromFile() {
        StringBuilder numbers = new StringBuilder();
        List<Integer> inputSet = new ArrayList<>();
        String input = Demo.readFile(randomUnsorted);
        String[] inputArr = input.split(" ");
        for (String s : inputArr) {
            inputSet.add(Integer.parseInt(s));
        }
        try {
            bubbleSortAlgorithm(inputSet);
            for (Integer numbs : inputSet) {
                numbers.append(numbs).append(" ");
            }
            PrintWriter pw = new PrintWriter(randomSorted);
            pw.print(numbers);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void demonstrateUnsorted() {
        String result = "input ==> ";
        System.out.println(result + Demo.readFile(randomUnsorted));

    }

    private static void demonstrateSorted() {
        String result = "output ==> ";
        System.out.println(result + Demo.readFile(randomSorted));
    }

    private static List<Integer> bubbleSortAlgorithm(List<Integer> list) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            for (int x = 0; x < list.size(); x++) {
                for (int i = 0; i < list.size() - x - 1; i++) {
                    isSorted = true;
                    if (list.get(i) > list.get(i + 1)) {
                        isSorted = false;
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
        }
        return list;
    }

}
