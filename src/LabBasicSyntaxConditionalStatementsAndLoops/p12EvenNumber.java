package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        boolean isOdd = num % 2 != 0;

        while (isOdd) {
            System.out.println("Please write an even number.");
            num = Math.abs(Integer.parseInt(scanner.nextLine()));
            isOdd = num % 2 != 0;
        }
        System.out.printf("The number is: %d", num);
    }
}