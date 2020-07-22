package com.epam.rd.java.basic.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {

    public static void main(String[] args) {
        // just my empty main method
        String input = Demo.readFile("part4.txt");
        Pattern pattern = Pattern.compile("(?U)[A-ZА-ЯЁ].+?\\.");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
