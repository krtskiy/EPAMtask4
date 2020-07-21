package com.epam.rd.java.basic.practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        // just my empty main method
    }

    public static String readFile(String path) {
        StringBuilder result = new StringBuilder();
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file, "cp1251");
            while (scan.hasNextLine()) {
                result.append(scan.nextLine()).append(System.lineSeparator());
            }
        scan.close();
        return result.toString().trim();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //NOSONAR
        }
        return result.toString();
    }

}
