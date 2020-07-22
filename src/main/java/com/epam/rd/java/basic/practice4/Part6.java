package com.epam.rd.java.basic.practice4;

import java.util.Scanner;

public class Part6 {

    public static void main(String[] args) {
        // just my empty main method
        Scanner scan = new Scanner(System.in);
        while (true) {
            String userInput = scan.nextLine();
            if (userInput.equals("Cyrl")) {
                System.out.println(userInput + ": Робітники Заморились працювати С барабаном ходит ёжик Бум бум бум");
                System.out.println();
            } else if (userInput.equals("Latn")) {
                System.out.println(userInput + ": Is there anybody going to listen to my story");
                System.out.println();
            } else if (userInput.equals("stop")) {
                scan.close();
                break;
            } else {
                System.out.println(userInput + ": Incorrect input");
                System.out.println();
            }
        }

    }

}
