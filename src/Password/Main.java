package Password;

import java.util.Scanner;

public class Main implements EncryptDecrypt {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        Cipher cipher = new Cipher(text, 5);

        System.out.println("Encrypted text:" + cipher.encryption(text));

        System.out.println("What is the key code?");
        int key = scanner.nextInt();
        if (key == cipher.number) {
            System.out.println("Decrypted text is:" + cipher.decryption(cipher.encryption(text)));
        }

    }
}
