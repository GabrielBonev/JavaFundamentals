package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p16Messages_MoreExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tapTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tapTimes; i++) {
            String input = scanner.nextLine();


            int numberOfDigits = input.length();
            char buttonNumber = input.charAt(0);

            if (buttonNumber == '2') {
                if (numberOfDigits == 1) {
                    System.out.print("a");
                } else if (numberOfDigits == 2) {
                    System.out.print("b");
                } else if (numberOfDigits == 3) {
                    System.out.print("c");
                }
            } else if (buttonNumber == '3') {
                if (numberOfDigits == 1) {
                    System.out.print("d");
                } else if (numberOfDigits == 2) {
                    System.out.print("e");
                } else if (numberOfDigits == 3) {
                    System.out.print("f");
                }
            } else if (buttonNumber == '4') {
                if (numberOfDigits == 1) {
                    System.out.print("g");
                } else if (numberOfDigits == 2) {
                    System.out.print("h");
                } else if (numberOfDigits == 3) {
                    System.out.print("i");
                }
            } else if (buttonNumber == '5') {
                if (numberOfDigits == 1) {
                    System.out.print("j");
                } else if (numberOfDigits == 2) {
                    System.out.print("k");
                } else if (numberOfDigits == 3) {
                    System.out.print("l");
                }
            } else if (buttonNumber == '6') {
                if (numberOfDigits == 1) {
                    System.out.print("m");
                } else if (numberOfDigits == 2) {
                    System.out.print("n");
                } else if (numberOfDigits == 3) {
                    System.out.print("o");
                }
            } else if (buttonNumber == '7') {
                if (numberOfDigits == 1) {
                    System.out.print("p");
                } else if (numberOfDigits == 2) {
                    System.out.print("q");
                } else if (numberOfDigits == 3) {
                    System.out.print("r");
                } else if (numberOfDigits == 4) {
                    System.out.print("s");
                }
            } else if (buttonNumber == '8') {
                if (numberOfDigits == 1) {
                    System.out.print("t");
                } else if (numberOfDigits == 2) {
                    System.out.print("u");
                } else if (numberOfDigits == 3) {
                    System.out.print("v");
                }
            } else if (buttonNumber == '9') {
                if (numberOfDigits == 1) {
                    System.out.print("w");
                } else if (numberOfDigits == 2) {
                    System.out.print("x");
                } else if (numberOfDigits == 3) {
                    System.out.print("y");
                } else if (numberOfDigits == 4) {
                    System.out.print("z");
                }
            } else if (buttonNumber == '0') {
                System.out.print(" ");
            }
        }
    }
}