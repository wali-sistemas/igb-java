package co.igb.dto;

/**
 *
 * @author dbotero
 */
public class AuthenticationResponseDTO {

    private int code;
    private String message;
    private UserDTO user;

    public AuthenticationResponseDTO() {
    }

    public AuthenticationResponseDTO(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AuthenticationResponseDTO{" + "code=" + code + ", message=" + message + ", user=" + user + '}';
    }

}
