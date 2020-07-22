package com.epam.rd.java.basic.practice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part6 {

    public static void main(String[] args) {
        printWordsByAlphabetType();
    }

    private static final String CYRILLIC_WORDS = "\\b[А-яЁёІіЇїЄє]+?\\b";
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
        while (matcherCyrl.find() && matcherLatn.find()) {
            if (userInput.equals("Latn") || userInput.equals("latn")) {
                result.append(matcherLatn.group()).append(" ");
            } else if (userInput.equals("Cyrl") || userInput.equals("cyrl")) {
                result.append(matcherCyrl.group()).append(" ");
            } else if (userInput.equals("stop")) {
                scan.close();
            } else {
                result.append("Incorrect input");
                break;
            }
        }
        System.out.println(result);
    }

}
