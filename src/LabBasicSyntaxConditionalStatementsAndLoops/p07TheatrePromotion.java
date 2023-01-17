package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;

        if (ageOfPerson >= 0 && ageOfPerson <= 18) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 5;
            } else {
                isValid = false;
            }
        } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
            if (typeOfDay.equals("Weekday")) {
                price = 18;
            } else if (typeOfDay.equals("Weekend")) {
                price = 20;
            } else if (typeOfDay.equals("Holiday")) {
                price = 12;
            } else {
                isValid = false;
            }
        } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 10;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }
        if (!isValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}