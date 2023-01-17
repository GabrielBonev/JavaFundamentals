package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestCount = Integer.parseInt(scanner.nextLine());
        String typeGuest = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (typeGuest.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
            if (guestCount >= 30) {
                price = price * 0.85;
            }
        } else if (typeGuest.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
            if (guestCount >= 100) {
                guestCount = guestCount - 10;
            }
        } else if (typeGuest.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
            if (guestCount >= 10 && guestCount <= 20) {
                price = price * 0.95;
            }
        }
            double totalPrice = guestCount * price;
            System.out.printf("Total price: %.2f",totalPrice);
        }
    }

