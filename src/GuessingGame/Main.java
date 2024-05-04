package GuessingGame;

import UserInputValidator.InputCategory;

import java.util.Scanner;

public class Main {
    static boolean yesOrNo(String respond){
        return respond.equalsIgnoreCase("yes");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to character guessing game!");
        System.out.println("Are you outgoing and sociable?");
        String respond1 = scanner.next();
        System.out.println("Do you enjoy spending time alone?");
        String respond2 = scanner.next();
        if (yesOrNo(respond1) && !yesOrNo(respond2)) {
            System.out.println(CharacterTypes.EXTROVERTED.message);
        }
        if (!yesOrNo(respond1) && yesOrNo(respond2)) {
            System.out.println(CharacterTypes.INTROVERTED.message);
        }
        if ((yesOrNo(respond1) && yesOrNo(respond2)) || (!(yesOrNo(respond1)) && !yesOrNo(respond2))){
            System.out.println("Are you comfortable in both social and solitary situations? ");
            String respond3 = scanner.next();
            if (yesOrNo(respond1) && yesOrNo(respond2) && yesOrNo(respond3)) {
                System.out.println(CharacterTypes.AMBIVERTED.message);
            } else if (yesOrNo(respond1) && yesOrNo(respond2) && !yesOrNo(respond3)) {
                System.out.println(CharacterTypes.OMNIVERTED.message);
                
            } else if (!yesOrNo(respond1) && !yesOrNo(respond2) && yesOrNo(respond3)) {
                System.out.println(CharacterTypes.AMBIVERTED.message);
            } else if (!yesOrNo(respond1) && !yesOrNo(respond2) && !yesOrNo(respond3)) {
                System.out.println(CharacterTypes.OMNIVERTED.message);

            }


        }
    }
}
