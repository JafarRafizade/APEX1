package Password;

public interface EncryptDecrypt {
    default String encryption(String text, int number) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'a' + 3) % 26) + 'a');
                encryptedText.append(encryptedChar);

            } else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();

    }
    default String decryption(String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char currentChar = encryptedText.charAt(i);
            if (Character.isLetter(currentChar)) {
                char decryptedChar = (char) (((currentChar - 'a' + 3) % 26) + 'a');
                decryptedText.append(decryptedChar);

            } else {
                decryptedText.append(currentChar);
            }
        }
        return decryptedText.toString();
    }

}
