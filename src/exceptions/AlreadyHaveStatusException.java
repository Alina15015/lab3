package exceptions;

public class AlreadyHaveStatusException extends RuntimeException {
    public AlreadyHaveStatusException(String message) {
        super(message);
    }
}
