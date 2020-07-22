package com.epam.rd.java.basic.practice4;

import java.util.Locale;
import java.util.ResourceBundle;

public class Part5 {

    public static void main(String[] args) {
        Locale localeRu = new Locale("ru");
        ResourceBundle bundleRu = ResourceBundle.getBundle("resources", localeRu);
        System.out.println(bundleRu.getString("table"));
        Locale localeEn = new Locale("en");
        ResourceBundle bundleEn = ResourceBundle.getBundle("resources", localeEn);
        System.out.println(bundleEn.getString("table"));


    }

}
