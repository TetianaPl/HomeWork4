package com.epam.lesson4;

import java.util.Scanner;

public class Main {

    public static String printUniqueSymbols(String stringOut) {
        int length = stringOut.length();
        int position = 0;
        char symbolDefoult;
        final String EMPTY = "";

        while (position < length) {
            symbolDefoult = stringOut.charAt(position);
            if (stringOut.indexOf(symbolDefoult) != stringOut.lastIndexOf(symbolDefoult)) {
                stringOut = symbolDefoult + stringOut.replaceAll(stringOut.substring(position, position + 1), EMPTY);
                length = stringOut.length();
            }
            position++;
        }
        return stringOut;
    }

    public static String convertToBinary(int number) {
        String binary = "";
        int figure;
        do {
            figure = number % 2;
            number = number / 2;
            binary = figure + binary;
        }
        while (number > 0);
        return binary;
    }

    public static String getTwoLastFigures(int number) {
        String twoLastFigures = "";
        int figure = number % 10;       // Последняя цифра (единицы)
        twoLastFigures = twoLastFigures + figure;
        if (number > 9) {
            figure = (number % 100) / 10;   // Предпоследняя цифра (десятки)
            twoLastFigures = twoLastFigures + figure;
        }
        return twoLastFigures;
    }

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      ********** TASK #1 **********
        System.out.println("********** TASK #1 **********");
        System.out.println();
        System.out.print("Entry string: -> ");
        String stringIn = input.nextLine();
        System.out.println();
        System.out.println("Sourse string: " + stringIn);
        System.out.println("Unique symbols in this string:");
        System.out.println(printUniqueSymbols(stringIn));
        System.out.println();

//      ********** TASK #2 **********
        System.out.println("********** TASK #2 **********");
        System.out.println();
        System.out.print("Entry integer positive number: -> ");
        int number = input.nextInt();
        System.out.println();
        String binary = convertToBinary(number);
        System.out.println("Binary notation for number " + number + " is: " + binary);
        System.out.println();

//      ********** TASK #3 **********
        System.out.println("********** TASK #3 **********");
        System.out.println();
        System.out.print("Entry integer number: -> ");
        number = input.nextInt();
        System.out.println();
        String twoLastFigures = getTwoLastFigures(number);
        System.out.println("Two last figures for number " + number + " in reverse order are: " + twoLastFigures);
        System.out.println();

    }
}
