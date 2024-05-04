package UserInputValidator;

import java.util.Scanner;

public class Main {
    static boolean validateNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!Character.isDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    static boolean validateTextInput(String text) {
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!Character.isLetter(currentChar)) {
                return false;
            }

        }
        return true;
    }

    static boolean validateSpecialCharacterInput(String text) {
        return validateNumber(text) && validateTextInput(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.next();
        if (validateNumber(text)) {
            System.out.println(InputCategory.NUMBER.value);
        } else if (validateTextInput(text) ) {
            System.out.println(InputCategory.TEXT.value);
        } else if (validateSpecialCharacterInput(text)) {
            System.out.println(InputCategory.SPECIAL_CHARACTER.value);

        } else if (validateNumber(text))System.out.println("All of them exist in the text ");
    }

}
