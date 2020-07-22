package com.epam.rd.java.basic.practice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part6 {

    public static void main(String[] args) {
        printWordsByAlphabetType();
    }

    private static final String CYRILLIC_WORDS = "[А-яЁёІіЇїЄє]+";
    private static final String LATIN_WORDS = "\\b\\w+?\\b";

    private static void printWordsByAlphabetType() {
        StringBuilder result = new StringBuilder();
        String input = Demo.readFile("part6.txt");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        Pattern patternCyrl = Pattern.compile(CYRILLIC_WORDS);
        Matcher matcherCyrl = patternCyrl.matcher(input);
        Pattern patternLatn = Pattern.compile(LATIN_WORDS);
        Matcher matcherLatn = patternLatn.matcher(input);
        if (userInput.equals("Latn") || userInput.equals("latn")) {
            while (matcherLatn.find()) {
                result.append(matcherLatn.group()).append(" ");
            }
        } else if (userInput.equals("Cyrl") || userInput.equals("cyrl")) {
            while (matcherCyrl.find()) {
                result.append(matcherCyrl.group()).append(" ");
            }
        } else if (userInput.equals("stop")) {
            scan.close();
        } else {
            result.append("Incorrect input");
        }
        System.out.println(userInput + ": " + result);
    }

}
