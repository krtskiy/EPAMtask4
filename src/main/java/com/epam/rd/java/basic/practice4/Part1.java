package com.epam.rd.java.basic.practice4;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    static String input = Demo.readFile("part1.txt");

    public static void main(String[] args) {
        System.out.println(replaceFirstTwoLetters()); //NOSONAR
    }

    private static String replaceFirstTwoLetters() {
        String input = Demo.readFile("part1.txt");
        Pattern p = Pattern.compile("(?U)\\b\\w{4,}?\\b");
        Matcher m = p.matcher(input);
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group().substring(2));
        }
        return input;
    }

}
