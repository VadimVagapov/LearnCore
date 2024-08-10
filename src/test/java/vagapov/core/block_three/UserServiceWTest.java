package vagapov.core.block_three;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserServiceWTest {

    @Mock
    private RestTemplate restTemplate;

    private UserServiceW userServiceW;

    @BeforeEach
    void setup() {
        userServiceW = new UserServiceW(restTemplate);
    }

    @Test
    @DisplayName("Создание пользователя, ответ от UserService пришел успешный (200)")
    void createUserTest_when200() {
        when(restTemplate.postForEntity(anyString(), any(), any(), anyMap())).thenReturn(ResponseEntity.ok("Пользователь создан"));
        String request = getRequest();

        userServiceW.createUser(UUID.randomUUID(), request);
    }

    @Test
    @DisplayName("Создание пользователя, ответ от UserService пришел успешный (4xx)")
    void createUserTest_when400() {
        when(restTemplate.postForEntity(anyString(), any(), any(), anyMap())).thenThrow(HttpClientErrorException.create(HttpStatus.BAD_REQUEST, "", new HttpHeaders(), "new".getBytes(), null));
        String request = getRequest();

        userServiceW.createUser(UUID.randomUUID(), request);
    }

    @Test
    @DisplayName("Создание пользователя, ответ от UserService пришел успешный (5xx)")
    void createUserTest_when500() {
        when(restTemplate.postForEntity(anyString(), any(), any(), anyMap())).thenThrow(HttpServerErrorException.create(HttpStatus.INTERNAL_SERVER_ERROR, "", new HttpHeaders(), "new".getBytes(), null));
        String request = getRequest();

        userServiceW.createUser(UUID.randomUUID(), request);
    }

    @Test
    @DisplayName("Создание пользователя, ответ от UserService пришел успешный (200) но null")
    void createUserTest_when200_butResponseBodyIsNull() {
        when(restTemplate.postForEntity(anyString(), any(), any(), anyMap())).thenReturn(ResponseEntity.ok(null));
        String request = getRequest();

        userServiceW.createUser(UUID.randomUUID(), request);
    }

    private String getRequest() {
        return """
                "status": "SUCCESS",
                  "userId": "986432878721",
                  "firstName": "Иван",
                  "lastName": "Иванов",
                  "middleName": "Иванович",
                  "fullName": "Иванов Иван Иванович",
                  "documents": [
                    {
                      "identification": true,
                      "country": "RUS",
                      "name": "Паспорт",
                      "type": "21",
                      "series": "1201",
                      "number": "123098"
                    },
                    {
                      "identification": false,
                      "country": "AUS",
                      "name": "Паспорт",
                      "type": "45",
                      "series": "D450",
                      "number": "J09887Y"
                    }
                  ],
                  "addresses": [
                    {
                      "type": "Домашний адрес",
                      "value": "г. Уфа, с. Нагаево, будка собаки на углу магазина"
                    },
                    {
                      "type": "Рабочий адрес",
                      "value": "г. Уфа, с. Нагаево, магазин Пятерочка"
                    }
                  ]
                """;
    }
}
