package vagapov.core.block_3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.UUID;

/**
 * Данная задача крайняя в этом блоке и объединяет в себя две предыдущие
 *
 * Вам нужно:
 * 1. Прочитать какие возможные проблемы есть при использовании класса RestTemplate и узнать какие есть специфические исключения
 * 2. Добавить отдельную обработку исключений на 4хх и 5хх ошибки
 * 3. В случае ошибок кидать только свои новосозданные ошибки
 * 4. Добавить обработку своего исключения UserServiceTimeoutException и тех исключений какие считаете нужным
 * 5. Добавить логгер и понятное логирование в два метода по уровням принятым ранее в задаче SendService
 *
 * В блоке 3 есть директория куда нужно добавлять свои исключения (exception)
 */
public class UserServiceW {

    private final RestTemplate restTemplate;

    public UserServiceW(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String createUser(UUID userId, String request) {
        ResponseEntity<String> responseEntity;
        try {
            responseEntity = restTemplate.postForEntity(
                    "URL",
                    request,
                    String.class,
                    Map.of("userId", userId.toString()));

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        if (responseEntity != null && responseEntity.getBody() != null) {
            return responseEntity.getBody();
        } else {
            return null;
        }
    }

    public void deleteUser(UUID userId) {
        try {
            restTemplate.delete("URL", Map.of("userId", userId.toString()));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
