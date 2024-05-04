package GuessingGame;

public enum CharacterTypes {
    EXTROVERTED("Person is extrovert"),
    INTROVERTED("Person is introvert"),
    AMBIVERTED("Person is ambivert"),
    OMNIVERTED("Person is omnivert");
    String message;

    CharacterTypes(String message) {
        this.message = message;
    }
}
