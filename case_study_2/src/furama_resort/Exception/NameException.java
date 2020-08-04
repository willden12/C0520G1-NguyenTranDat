package furama_resort.Exception;

public class NameException extends Exception {
    public NameException(String messenger){
        super(messenger);
    }

    @Override
    public String getMessage() {
        return "InputName Error: "+super.getMessage();
    }
}
