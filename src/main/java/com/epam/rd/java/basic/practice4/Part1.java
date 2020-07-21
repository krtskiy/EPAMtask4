package com.epam.rd.java.basic.practice4;

import java.io.FileNotFoundException;

public class Part1 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        String[] words = Demo.readFile("part1.txt").split(" ");
        for (String word : words) {
            if (word.length() >= 4) {
                words[counter] = words[counter].substring(2, word.length());
            }
            counter++;
        }
        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
            result.append(words[i]).append(" ");
            } else {
            result.append(words[i]);
            }
        }
        System.out.println(result); //NOSONAR
    }

}
