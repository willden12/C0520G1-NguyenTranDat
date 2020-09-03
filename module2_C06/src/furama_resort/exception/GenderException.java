package furama_resort.exception;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error: Wrong Gender of Customer: "+super.getMessage();
    }
}
