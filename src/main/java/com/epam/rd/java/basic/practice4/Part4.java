package com.epam.rd.java.basic.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {

    public static void main(String[] args) {
        String input = Demo.readFile("part4.txt");
        Pattern pattern = Pattern.compile("(?U)[A-ZА-ЯЁ].+?\\.");
        Matcher matcher = pattern.matcher(input);
        String[] result = new String[20];
        int index = 0;
        while (matcher.find()) {
            result[index++] = matcher.group();
        }
        for (int i = 0; i < index; i++) {
            System.out.println(result[i]);
        }
    }

}
