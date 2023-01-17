package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSaberPRice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumLightSaber = Math.ceil(countOfStudents + 0.10 * countOfStudents) * lightSaberPRice;
        double sumRobes = countOfStudents * robesPrice;
        double sumBelt = (countOfStudents - countOfStudents / 6) * beltPrice;

        double totalSum = sumLightSaber + sumRobes + sumBelt;
        if (totalSum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }
    }
}
