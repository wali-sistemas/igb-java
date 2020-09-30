package co.igb.exception;

/**
 * @author dbotero
 */
public class WaliRuntimeException extends RuntimeException {
    public WaliRuntimeException() {
    }

    public WaliRuntimeException(String errorMessage) {
        super(errorMessage);
    }

    public WaliRuntimeException(Throwable throwable) {
        super(throwable);
    }

    public WaliRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}