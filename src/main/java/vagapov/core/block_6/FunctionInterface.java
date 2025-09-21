package vagapov.core.block_6;

import vagapov.core.block_6.model.User;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Поработаем с функ-ми интерфейсами
 */
public class FunctionInterface <T, K> {
    /**
     * Напишите метод с названием sqrt, который возвращает реализацию функционального интерфейса UnaryOperator,
     * который принимает целое число(тип int) и возвращает его квадрат.
     *
     * Требования:
     * 1. Метод должен возвращать реализацию интерфейса UnaryOperator.
     * 2. Параметризуйте метод так чтобы метод принимал только один целочисленный тип
     */
    public UnaryOperator<T> sqrt() {
        return x -> null;
    }

    /**
     * Создайте функциональный интерфейс getString(),
     * который принимает объект любого класса и возвращает его строковое представление
     *
     * Требования:
     * 1. В случае когда приходит 'null' возвращать пустую строку
     */
    public  UnaryOperator<T> getString() {
        return x -> null;
    }

    /**
     * Создайте функциональный интерфейс sortUserByUserRight(),
     * который принимает два объекта класса User (лежит в папке model)
     * и возвращает пользователя у которого больше всего прав
     *
     * Требования:
     * 1. В случае когда приходит 1 из пользователей = 'null' возвращать второго
     * 2. Когда двое пользователей null - выкидывать ошибку IllegalArgumentException
     * 3. Если у одного пользователя нашлись права "Owner" - сразу возвращать его.
     * 4. Если у двоих пользователей есть права "Owner" то возвращать у кого больше количества прав
     */
    public BinaryOperator<User> sortUserByUserRight() {
        return (x, y) -> null;
    }

    /**
     * Создайте функциональный интерфейс sortUserByUserName(),
     * который принимает два объекта класса User (лежит в папке model)
     * и возвращает пользователя у которого имя идет первое при сортировке
     */
    public BinaryOperator<User> sortUserByUserName() {
        return (x, y) -> null;
    }
}
