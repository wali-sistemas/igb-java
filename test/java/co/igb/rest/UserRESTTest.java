package co.igb.rest;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.openMocks;

import co.igb.dto.AuthenticationResponseDTO;
import co.igb.dto.UserDTO;
import javax.ws.rs.core.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class UserRESTTest {

    private static final String COMPANY_NAME = "company-name";
    private static final int ERROR_CODE = 1;

    @Mock
    private UserDTO userDTO;

    @InjectMocks
    private UserREST userService;

    @BeforeEach
    void setup() {
        openMocks(this);
    }

    @Test
    void login_whenUserIsNull_shouldReturnError() {
        Response response = userService.login(null, COMPANY_NAME, true);

        assertThat(response).isNotNull();
        assertThat(response.getEntity()).isNotNull()
                                        .isInstanceOf(AuthenticationResponseDTO.class);

        AuthenticationResponseDTO responseDTO = (AuthenticationResponseDTO) response.getEntity();
        assertThat(responseDTO.getCode()).isEqualTo(ERROR_CODE);
        assertThat(responseDTO.getMessage()).isEqualTo("No se enviaron todos los datos necesarios para iniciar sesion. ");
    }

    @Test
    void listEmployees() {
    }

    @Test
    void validateUserGroup() {
    }

    @Test
    void approveUserAccess() {
    }

    @Test
    void validateToken() {
    }

    @Test
    void getUserInfo() {
    }
}
