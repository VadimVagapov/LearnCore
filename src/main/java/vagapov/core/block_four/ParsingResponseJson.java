package vagapov.core.block_four;

import vagapov.core.block_four.model.UserResponse;

import java.io.IOException;

/**
 * Задача из рабочего процесса
 * Приходит от стороннего сервиса через КАФКУ ответ в виде JSON-файла
 * Нам нужно его распарсить в объекты и работать дальше с объектами в нашей программе
 *
 * 1. Файл который нужно распарсить лежит по пути: /response/responseKafkaUser.json
 * 2. Прочитайте про парсинг json сообщений (библиотека jackson)
 * 3. В данном блоке есть директория "model" там лежит внешний класс "UserResponse" дополните его и если нужно создайте новые классы
 * 4. Если приступили к этой задаче после парсинга xml то используйте те же модельки
 * P.s.: чтобы добраться до файла есть хороший метод "getResource()" который возвращает URL
 */
public class ParsingResponseJson {

    public UserResponse method() throws IOException {

        return null;
    }
}
