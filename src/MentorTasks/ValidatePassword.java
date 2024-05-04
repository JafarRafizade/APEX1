package MentorTasks;

public class ValidatePassword {
    public void validatePassword(String password) throws UppercaseException, lowercaseException, DigitException, LengthException {
        boolean containsUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
                break;
            }
        }
        if (!containsUppercase) {
            throw new UppercaseException("Sentence must contain at least one uppercase letter.");
        }
        boolean containsLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                containsLowercase = true;
                break;
            }
        }
        if (!containsLowercase) {
            throw new lowercaseException("Sentence must contain at least one lowercase letter.");
        }
        boolean containsDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit) {
            throw new DigitException("Sentence must contain at least one digit.");
        }
        if (password.length() < 8) {
            throw new LengthException("The password must be at least 8 characters long.");
        }



    }


}
