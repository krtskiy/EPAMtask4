package com.epam.rd.java.basic.practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Demo {

    private static final InputStream STD_IN = System.in;

    public static void main(String[] args) {
        System.out.println("=========================== PART1");

        Part1.main(args);

        System.out.println("=========================== PART2");

        Part2.main(args);

        System.out.println("=========================== PART3");

        // set the mock input

        System.setIn(new ByteArrayInputStream( //NOSONAR

                "char^String^int^double^stop".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part3.main(args);

        // restore the standard input

        System.setIn(STD_IN); //NOSONAR

        System.out.println("=========================== PART4");

        Part4.main(args);

        System.out.println("=========================== PART5");

        // set the mock input

        System.setIn(new ByteArrayInputStream( //NOSONAR

                "table ru^table en^apple ru^stop".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part5.main(args);

        // restore the standard input

        System.setIn(STD_IN); //NOSONAR

        System.out.println("=========================== PART6");

        // set the mock input

        System.setIn(new ByteArrayInputStream( //NOSONAR

                "Latn^Cyrl^asdf^latn^cyrl^stop".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part6.main(args);

        // restore the standard input

        System.setIn(STD_IN); //NOSONAR
    }

    public static String readFile(String path) {
        StringBuilder result = new StringBuilder();
        File file = new File(path); //NOSONAR
        try {
            Scanner scan = new Scanner(file, "cp1251");
            while (scan.hasNextLine()) {
                result.append(scan.nextLine()).append(System.lineSeparator());
            }
        scan.close();
        return result.toString().trim();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

}
