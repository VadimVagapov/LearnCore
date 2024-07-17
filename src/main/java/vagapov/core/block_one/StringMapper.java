package vagapov.core.block_one;

public class StringMapper {

    public static final String MESSAGE = "Ошибка преобразования строки в число";

    /**
     * Напиши метод который преобразует строку в число. Если @param value пришло как null, то выкидывать RuntimeException.
     * В остальных случаях выкидывать NumberFormatException. В любом исключении использовать сообщение исключения - "MESSAGE"
     */
    public Number mapString2Number(String value) {
        return null;
    }

    /**
     * Реализуй метод, проверяющий, является ли заданная строка палиндромом.
     * Если @param value пришло как null или пустая строка, то не должно быть ошибки, нужно возвращать false
     */
    public boolean isPalindrome(String value) {
        return false;
    }

    /**
     * Reglex. Соответствует ли эта строка почтовому ящику сервисов Google (gmail.com) или Microsoft (outlook.com).
     * Будем считать, что в корректном почтовом ящике можно использовать только цифры и буквы.
     * Если @param value пришло как null или пустая строка, то не должно быть ошибки, нужно возвращать false
     */
    public boolean isEmail(String value) {
        return false;
    }

}
