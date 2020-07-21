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

    private static String part3Path = "part3.txt";

    private static void returnValueByType() {
        Map<String, String> inputMap = new LinkedHashMap<>();
        String input = Demo.readFile(part3Path);
        String regexFindIntegers = "(?<=\\s)\\d+(?=\\s)";
        String regexFindCharacters = "\\b[A-zА-яЁё]\\b";
        String regexFindDoublesWithIntPart = "\\b\\d+?\\.\\d+?\\b";
        String regexFindDoublesWithoutIntPart = "(?<=\\s)\\.\\d+\\b";
        String regexFindStrings = "\\b[A-zА-яЁё]{2,}?\\b";
        Pattern pFindIntegers = Pattern.compile(regexFindIntegers);
        Matcher mFindIntegers = pFindIntegers.matcher(input);
        while (mFindIntegers.find()) {
            inputMap.put(mFindIntegers.group(), "int");
        }
        Pattern pFindCharacters = Pattern.compile(regexFindCharacters);
        Matcher mFindCharacters = pFindCharacters.matcher(input);
        while (mFindCharacters.find()) {
            inputMap.put(mFindCharacters.group(), "char");
        }
        Pattern pFindDoublesWithIntPart = Pattern.compile(regexFindDoublesWithIntPart);
        Matcher mFindDoublesWithIntPart = pFindDoublesWithIntPart.matcher(input);
        while (mFindDoublesWithIntPart.find()) {
            inputMap.put(mFindDoublesWithIntPart.group(), "double");
        }
        Pattern pFindDoublesWithoutIntPart = Pattern.compile(regexFindDoublesWithoutIntPart);
        Matcher mFindDoublesWithoutIntPart = pFindDoublesWithoutIntPart.matcher(input);
        while (mFindDoublesWithoutIntPart.find()) {
            inputMap.put(mFindDoublesWithoutIntPart.group(), "double");
        }
        Pattern pFindStrings = Pattern.compile(regexFindStrings);
        Matcher mFindStrings = pFindStrings.matcher(input);
        while (mFindStrings.find()) {
            inputMap.put(mFindStrings.group(), "String");
        }


        Scanner scan = new Scanner(System.in);
        while (true) {
            String userInput = scan.nextLine();
            if (userInput.equals("String")) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals("String")) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals("char")) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals("char")) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals("int")) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals("int")) {
                        sb.append(entry.getKey()).append(" ");
                    }
                    System.out.print(sb);
                }
                System.out.println();
            } else if (userInput.equals("double")) {
                for (Map.Entry<String, String> entry : inputMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    if (entry.getValue().equals("double")) {
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
