package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p14GamingStore_MoreExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double spendMoney = 0;
        String gameName = scanner.nextLine();

        while (!"Game Time".equals(gameName)) {
            if (gameName.equals("OutFall 4")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 39.99;
                    spendMoney += 39.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else if (gameName.equals("CS: OG")) {
                if (currentBalance < 15.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 15.99;
                    spendMoney += 15.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else if (gameName.equals("Zplinter Zell")) {
                if (currentBalance < 19.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 19.99;
                    spendMoney += 19.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else if (gameName.equals("Honored 2")) {
                if (currentBalance < 59.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 59.99;
                    spendMoney += 59.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else if (gameName.equals("RoverWatch")) {
                if (currentBalance < 29.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 29.99;
                    spendMoney += 29.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 39.99;
                    spendMoney += 39.99;
                    System.out.printf("Bought %s%n", gameName);
                }
            } else {
                System.out.println("Not Found");
                gameName = scanner.nextLine();
                continue;
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            gameName = scanner.nextLine();
        }
        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, currentBalance);
        }
    }
}
