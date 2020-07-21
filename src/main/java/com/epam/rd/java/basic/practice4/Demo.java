package com.epam.rd.java.basic.practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        // just my empty main method
    }

    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();
        File file = new File(path);
        Scanner scan = new Scanner(file, "UTF-8");
        while (scan.hasNextLine()) {
            result.append(scan.nextLine()).append(System.lineSeparator());
        }
            scan.close();
            return result.toString().trim();
    }

}
