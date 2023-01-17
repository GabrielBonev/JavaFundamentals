package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHours = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (initHours * 60) + initMinutes + 30;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        System.out.printf("%d:%02d", hours ,minutes);
    }
}
