package vagapov.core.block_three;

/**
 * Здесь нужно создать свое новое исключение
 * Исключение будет использовано когда мы не будем получать от стороннего сервиса ответ втечении 5 секунд запроса
 * 1. Исключение должно обрабатываться в рантайме или не обрабатываться вовсе
 * 2. Должно принимать в себя код ошибки и сообщение об ошибке (все тип String)
 * 3. Должно давать возможность (при обработке) достать код и сообщение и прочитать их
 */
public class UserServiceTimeoutException {
}
