package Password;

public class Cipher {
    String text;
    int number;

    public Cipher(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String encryption (String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'A' + 3) % 26) + 'A');
                encryptedText.append(encryptedChar);

            } else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'a' + 3) % 26) + 'a');
                encryptedText.append(encryptedChar);


            } else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();

    }
    public String decryption (String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char currentChar = encryptedText.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                char decryptedChar = (char) (((currentChar - 'a' + 23) % 26) + 'a');
                decryptedText.append(decryptedChar);

            } else if (Character.isUpperCase(currentChar)) {
                char decryptedChar = (char) (((currentChar - 'A' + 23) % 26) + 'A');
                decryptedText.append(decryptedChar);

            } else {
                decryptedText.append(currentChar);
            }
        }
        return decryptedText.toString();
    }

}
