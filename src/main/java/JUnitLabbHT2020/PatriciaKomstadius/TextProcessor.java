package JUnitLabbHT2020.PatriciaKomstadius;

import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in din text för att få den omvänd: ");
        String backwards = scan.nextLine();

        textBackwards(backwards);

        System.out.println("Skriv in din text med små bokstäver: ");
        String textInput = scan.nextLine();

        System.out.println("Din text med stora bokstäver: " + textToUpperCase(textInput));

        System.out.println("Skriv in din text med stora bokstäver: ");
        String textInput2 = scan.nextLine();

        System.out.println("Din text med små bokstäver: " + textToLowerCase(textInput2));

    }

    public static String textBackwards(String backwards) {
        StringBuilder str = new StringBuilder(backwards);
        StringBuilder reverseStr = str.reverse();
        System.out.println("Din text omvänd: " + reverseStr.toString());
        System.out.println();

        return reverseStr.toString();
    }

    public static String textToUpperCase (String textInput) {

        return textInput.toUpperCase();
    }

    public static String textToLowerCase (String textInput2) {

        return textInput2.toLowerCase();
    }

}