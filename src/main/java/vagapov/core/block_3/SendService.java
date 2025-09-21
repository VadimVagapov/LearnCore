package vagapov.core.block_3;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.UUID;

/**
 * Будем работать с логированием
 *
 * Примем в команде по уровням:
 * info  - логируем информацию для отслеживания запроса
 * debug - для отладки, например может быть большой запрос и постоянно им засорять логи не очень, но если ошибки какие-то - включим и посмотрим
 * warn  - если из-за каких либо проблем дальнейшая работа по запросу не проводится или проводится с ограничениями
 * error - логируем явные ошибки
 *
 * 1. Объявите логгер данного класса в классе (не в методе)
 * 2. Добавьте логирование там где думаете оно нужно
 *
 * Тестов в этом блоке не будет, как сделаете - показываете мне за день до ревью, вместе смотрим и если что даю на доработку
 */
@Service
public class SendService {

    private final RestTemplate restTemplate;

    public SendService(RestTemplate restTemplate) {
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
