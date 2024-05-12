package Exceptions;

public class IncorrectSourceAndDestinationException extends RuntimeException{
    private static final long serialVersionUID = -8544718846789591920L;
    public IncorrectSourceAndDestinationException(String message){
        super(message);
    }
}
