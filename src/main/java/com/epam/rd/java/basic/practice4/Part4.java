package com.epam.rd.java.basic.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {

    public static void main(String[] args) {
        parseSentencesFromFile();
    }

    private static void parseSentencesFromFile() {
        String lineSeparator = System.lineSeparator();
        String input = Demo.readFile("part4.txt");
        Pattern pattern = Pattern.compile("(?Us)[A-ZА-ЯЁ].+?\\.");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group().replaceAll(lineSeparator, " "));
        }
    }

}
