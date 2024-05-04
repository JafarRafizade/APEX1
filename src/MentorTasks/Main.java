package MentorTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
do {


    System.out.println("Enter the password");
    password = scanner.next();

    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            containsUppercase = true;
            break;
        }
    }

    for (char c : password.toCharArray()) {
        if (Character.isLowerCase(c)) {
            containsLowercase = true;
            break;
        }
    }

    for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {
            containsDigit = true;
            break;
        }
    }
    ValidatePassword validatePassword = new ValidatePassword();
    try {
        validatePassword.validatePassword(password);
    } catch (DigitException e) {
        System.out.println("The password must contain at least one digit");
    } catch (lowercaseException e) {
        System.out.println("The password must contain at least one lowercase letter");
        ;
    } catch (UppercaseException e) {
        System.out.println("The password must contain at least one uppercase letter.");
        ;
    } catch (LengthException e) {
        System.out.println("The password must be at least 8 characters long.");
        ;
    }
}while(!containsUppercase || !containsLowercase || !containsDigit || password.length() < 8);
    }

}
