package com.epam.rd.java.basic.practice4;


public class Part1 {

    static String input = Demo.readFile("part1.txt");

    public static void main(String[] args) {
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
        String resStr = result.toString();
        resStr = resStr.replaceAll("\\s{2,}", "\r\n");
        System.out.print(resStr); //NOSONAR
    }

}
