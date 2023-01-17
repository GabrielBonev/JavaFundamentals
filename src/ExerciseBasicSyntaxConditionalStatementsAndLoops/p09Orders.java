package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double allMoney = 0;
        for (int order = 1; order <= countOfOrders ; order++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = daysInMonth * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            allMoney += orderPrice;
        }
        System.out.printf("Total: $%.2f" , allMoney);
    }
}
