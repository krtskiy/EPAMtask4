package com.epam.rd.java.basic.practice4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {


    public static void main(String[] args) {
        returnValueByType();
    }

    private static final String STRING = "String";
    private static final String DOUBLE = "double";
    private static final String INTEGER = "int";
    private static final String CHARACTER = "char";
    private static final String REGEX_INTEGERS = "(?<=\\s)\\d+(?=\\s)";
    private static final String REGEX_CHARACTERS = "\\b[A-zА-яЁё]\\b";
    private static final String REGEX_DOUBLES_WITH_INT_PART = "\\b\\d+?\\.\\d+?\\b";
    private static final String REGEX_DOUBLES_WITHOUT_INT_PART = "(?<=\\s)\\.\\d+\\b";
    private static final String REGEX_STRINGS = "\\b[A-zА-яЁё]{2,}?\\b";

    private static void returnValueByType() {
        Map<String, String> inputMap = new LinkedHashMap<>();
        String input = Demo.readFile("part3.txt");
        Pattern pFindIntegers = Pattern.compile(REGEX_INTEGERS);
        Matcher mFindIntegers = pFindIntegers.matcher(input);
        while (mFindIntegers.find()) {
            inputMap.put(mFindIntegers.group(), INTEGER);
        }
        Pattern pFindCharacters = Pattern.compile(REGEX_CHARACTERS);
        Matcher mFindCharacters = pFindCharacters.matcher(input);
        while (mFindCharacters.find()) {
            inputMap.put(mFindCharacters.group(), CHARACTER);
        }
        Pattern pFindDoublesWithIntPart = Pattern.compile(REGEX_DOUBLES_WITH_INT_PART);
        Matcher mFindDoublesWithIntPart = pFindDoublesWithIntPart.matcher(input);
        while (mFindDoublesWithIntPart.find()) {
            inputMap.put(mFindDoublesWithIntPart.group(), DOUBLE);
        }
        Pattern pFindDoublesWithoutIntPart = Pattern.compile(REGEX_DOUBLES_WITHOUT_INT_PART);
        Matcher mFindDoublesWithoutIntPart = pFindDoublesWithoutIntPart.matcher(input);
        while (mFindDoublesWithoutIntPart.find()) {
            inputMap.put(mFindDoublesWithoutIntPart.group(), DOUBLE);
        }
        Pattern pFindStrings = Pattern.compile(REGEX_STRINGS);
        Matcher mFindStrings = pFindStrings.matcher(input);
        while (mFindStrings.find()) {
            inputMap.put(mFindStrings.group(), STRING);
        }


        Scanner scan = new Scanner(System.in);
        while (true) {
            String userInput = scan.nextLine();
            if (userInput.equals(STRING)) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals(STRING)) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals(CHARACTER)) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals(CHARACTER)) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals(INTEGER)) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals(INTEGER)) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals(DOUBLE)) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals(DOUBLE)) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals("stop")) {
                scan.close();
                break;
            } else {
                System.out.println("Incorrect input");
            }
        }

    }

}
