package com.epam.rd.java.basic.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {

    public static void main(String[] args) {
        String input = Demo.readFile("part4.txt");
        Pattern pattern = Pattern.compile("(?U)[A-ZА-ЯЁ].+?\\.");
        Matcher matcher = pattern.matcher(input);
        List<String> resultList = new ArrayList<>();
        while (matcher.find()) {
            resultList.add(matcher.group());
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }

}
