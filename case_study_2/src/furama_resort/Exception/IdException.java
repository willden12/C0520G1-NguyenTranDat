package furama_resort.Exception;

public class IdException extends Exception {
    public IdException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error: Id of customer wrong: "+super.getMessage();
    }
}
