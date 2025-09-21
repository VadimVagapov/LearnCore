package vagapov.core.block_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StringMapperIsPalindromeTest {

    StringMapper mapper = new StringMapper();

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Является ли строка палиндромом. Входное значение - null or empty")
    void isPalindrome_whenValueIsNull(String value) {
        System.out.println("Проверка на полиндром строки: " + value);
        assertFalse(assertDoesNotThrow(() -> mapper.isPalindrome(value)));
    }

    @ParameterizedTest
    @MethodSource("getStringNotPalindrome")
    @DisplayName("Является ли строка палиндромом. Входное значение неправильное")
    void isPalindrome_whenValueNotPalindrome(String value) {
        System.out.println("Проверка на полиндром строки: " + value);
        assertFalse(assertDoesNotThrow(() -> mapper.isPalindrome(value)));
    }

    @ParameterizedTest
    @MethodSource("getStringIsPalindrome")
    @DisplayName("Является ли строка палиндромом. Входное значение правильное")
    void isPalindrome_whenValueIsPalindrome(String value) {
        System.out.println("Проверка на полиндром строки: " + value);
        assertTrue(assertDoesNotThrow(() -> mapper.isPalindrome(value)));
    }

    static Stream<String> getStringNotPalindrome() {
        return Stream.of(
                "aabbcc",
                "aab6aa",
                "aaa ",
                " 0"
        );
    }

    static Stream<String> getStringIsPalindrome() {
        return Stream.of(
                "aabaa",
                "aaa",
                "   ",
                "aabbaa",
                "101",
                "Dayan nayad"
        );
    }

}
