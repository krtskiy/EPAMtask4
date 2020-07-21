package com.epam.rd.java.basic.practice4;

import java.util.HashMap;
import java.util.Map;

public class Part3 {


    public static void main(String[] args) {
        // regex task
        Map<String, Integer> intValues = new HashMap<>();
        Map<String, Character> charValues = new HashMap<>();
        Map<String, Double> doubleValues = new HashMap<>();
        Map<String, String> stringValues = new HashMap<>();

    }

    private static String part3Path = "part3.txt";

    private static void sort2Maps() {
        String input = Demo.readFile(part3Path);
        String regexFindIntegers = "(?<=\\s)\\d+(?=\\s)";
        String regexFindCharacters = "";
        String regexFindDoubles = "";
        String regexFindStrings = "\\b[A-zА-яЁё]{2,}?\\b";

    }
}
