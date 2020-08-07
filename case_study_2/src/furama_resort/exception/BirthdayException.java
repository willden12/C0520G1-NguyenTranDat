package furama_resort.exception;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error: wrong name format: " + super.getMessage();
    }
}
