package furama_resort.exception;

public class NameException extends Exception {
    public NameException(String messenger){
        super(messenger);
    }

    @Override
    public String getMessage() {
        return "InputName Error: "+super.getMessage();
    }
}
