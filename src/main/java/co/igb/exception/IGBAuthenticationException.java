package co.igb.exception;

/**
 * @author dbotero
 */
public class IGBAuthenticationException extends Exception {

    public IGBAuthenticationException(String errorMessage) {
        super(errorMessage);
    }
}