package UserInputValidator;

public enum InputCategory {
    NUMBER(" This is a number"),
    TEXT("This is a text"),
    SPECIAL_CHARACTER("This is a special character");
    final String value;

    InputCategory(String value) {
        this.value = value;
    }
}
