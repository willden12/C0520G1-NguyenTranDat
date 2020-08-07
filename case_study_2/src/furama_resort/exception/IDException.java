package furama_resort.exception;

public class IDException extends Exception {
    public IDException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error: Id of customer wrong: "+super.getMessage();
    }
}
