package com.epam.rd.java.basic.practice4;


public class Part1 {

    public static void main(String[] args) {
        String lineSeparator = System.lineSeparator();
        StringBuilder result = new StringBuilder();
        int counter = 0;
        String[] words = Demo.readFile("part1.txt").split("\\s");
        for (String word : words) {
            if (word.length() > 3) {
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
        String resultString = result.toString();
        resultString = resultString.replaceAll("\\s{2,}", lineSeparator);
        System.out.println(resultString); //NOSONAR
    }

}
