package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p15ReverseString_MoreExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverseInput = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            reverseInput = currentChar + reverseInput;
        }
        System.out.println(reverseInput);
        }
    }