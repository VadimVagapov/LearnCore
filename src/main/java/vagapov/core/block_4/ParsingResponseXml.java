package vagapov.core.block_4;

import vagapov.core.block_4.model.UserResponse;

import javax.xml.bind.JAXBException;

/**
 * Задача из рабочего процесса
 * Приходит от стороннего сервиса ответ в виде файла с расширением .xml
 * Нам нужно его распарсить в объекты и работать дальше с объектами в нашей программе
 *
 * 1. Файл который нужно распарсить лежит по пути: /response/responseUser.xml
 * 2. Прочитайте про парсинг xml сообщений (на хабре есть отличная статья)
 * 3. В данном блоке есть директория "model" там лежит внешний класс "UserResponse" дополните его и если нужно создайте новые классы
 * 4. Если приступили к этой задаче после парсинга json то используйте те же модельки
 * P.s.: чтобы добраться до файла есть хороший метод "getResourceAsStream()"
 */
public class ParsingResponseXml {

    public UserResponse method() throws JAXBException {

        return null;
    }
}


