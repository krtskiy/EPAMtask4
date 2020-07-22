package com.epam.rd.java.basic.practice4;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part5 {

    public static void main(String[] args) {
        Locale localeRu = new Locale("ru");
        ResourceBundle bundleRu = ResourceBundle.getBundle("resources", localeRu);
        Locale localeEn = new Locale("en");
        ResourceBundle bundleEn = ResourceBundle.getBundle("resources", localeEn);
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        Pattern pattern = Pattern.compile("(?U)\\w+?(?= )");
        Matcher matcher = pattern.matcher(userInput);
        while (matcher.find()) {
            if (userInput.contains(" ru")) {
                if (bundleRu.containsKey(matcher.group())) {
                    System.out.println(bundleRu.getString(matcher.group()));
                }
            } else if (userInput.contains(" en")) {
                if (bundleEn.containsKey(matcher.group())) {
                    System.out.println(bundleEn.getString(matcher.group()));
                }
            } else if (userInput.equals("stop")) {
                scan.close();
                break;
            } else {
                System.out.println("Incorrect input");
            }

        }
    }

}
