package co.igb.exception;

public class SAPSessionException extends RuntimeException {
    public SAPSessionException() {
    }

    public SAPSessionException(String errorMessage) {
        super(errorMessage);
    }

    public SAPSessionException(Throwable throwable) {
        super(throwable);
    }

    public SAPSessionException(String message, Throwable e) {
        super(message, e);
    }
}
