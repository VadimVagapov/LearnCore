package vagapov.core.block_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
public class WeekendTest {

    @ParameterizedTest
    @MethodSource("getAllEnum")
    @DisplayName("Проверка наличия всех ENUM")
    void checkAllEnum(String value) {
        System.out.println("Проверка на наличие ENUM: " + value);
        assertDoesNotThrow(() -> Weekend.valueOf(value));
    }

    static Stream<String> getAllEnum() {
        return Stream.of(
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY",
                "SUNDAY"
        );
    }

    @ParameterizedTest
    @MethodSource("getEnumNotWeekend")
    @DisplayName("Является ли этот день выходным днем?. Входное значение неправильное")
    void isWeekend_whenNot(String value) {
        System.out.println("Является ли этот день выходным днем: " + value);
        assertFalse(assertDoesNotThrow(() -> Weekend.valueOf(value).isWeekend()));
    }

    static Stream<String> getEnumNotWeekend() {
        return Stream.of(
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY"
        );
    }

    @ParameterizedTest
    @MethodSource("getEnumWeekend")
    @DisplayName("Является ли этот день выходным днем?. Входное значение правильное")
    void isWeekend_whenRight(String value) {
        System.out.println("Является ли этот день выходным днем: " + value);
        assertTrue(assertDoesNotThrow(() -> Weekend.valueOf(value).isWeekend()));
    }

    static Stream<String> getEnumWeekend() {
        return Stream.of(
                "SATURDAY",
                "SUNDAY"
        );
    }

    @ParameterizedTest
    @MethodSource("getAllEnumEngAndRus")
    @DisplayName("Проверка русских названий дней недели")
    void checkAllEnumRus(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Проверка на русское название недели: " + entry.getKey());
            assertEquals(entry.getValue(), assertDoesNotThrow(() -> Weekend.valueOf(entry.getKey()).getRusName()).toLowerCase());
        }

    }

    static Stream<Map<String, String>> getAllEnumEngAndRus() {
        return Stream.of(
                Map.of("MONDAY", "понедельник"),
                Map.of("TUESDAY", "вторник"),
                Map.of("WEDNESDAY", "среда"),
                Map.of("THURSDAY", "четверг"),
                Map.of("FRIDAY", "пятница"),
                Map.of("SATURDAY", "суббота"),
                Map.of("SUNDAY", "воскресенье")
        );
    }
}
