package com.epam.additional;

import java.util.Scanner;

public class Main {


    public static String printPyramid(int height, int line) {
        String pyramidLine = "";
        String patternLine = " 1 2 3 4 5 6 7 8 910 9 8 7 6 5 4 3 2 1 ";
        String emptyLine = "                  "; // 18 пробелов

        pyramidLine = pyramidLine + emptyLine.substring(0, (height + 1 - line) * 2);
        pyramidLine = pyramidLine + patternLine.substring(0, line * 2) + patternLine.substring(40 - line * 2, 38);
        return pyramidLine;
    }

    public static char getFirstSymbol(String stringIn, int wordNumber) {
        int number = 1;
        int symbolPosition = 0;
        stringIn = stringIn.trim();
        while (number < wordNumber) {
            symbolPosition = stringIn.indexOf(" ");
            stringIn = stringIn.substring(symbolPosition);
            stringIn = stringIn.trim();
            number++;
        }
        return stringIn.charAt(0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

//      ********** TASK #4 **********
        System.out.println("********** TASK #4 **********");
        System.out.println();

        System.out.print("Enter pyramid height from 1 to 9: -> ");
        int height = input.nextInt();
        int line = 1;
        while (line <= height + 1) {
            System.out.println(printPyramid(height, line));
            line++;
        }

//      ********** TASK #5 **********
        System.out.println("********** TASK #5 **********");
        System.out.println();

        System.out.println("Enter a few words with spaces : ");
        String stringIn = read.nextLine();
        System.out.print("Enter word number: -> ");
        int wordNumber = input.nextInt();
        System.out.println();
        char symbol = getFirstSymbol(stringIn, wordNumber);
        System.out.println("The first symbol of " + wordNumber + "th word is " + symbol);

    }
}
