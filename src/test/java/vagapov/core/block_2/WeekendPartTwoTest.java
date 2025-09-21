package vagapov.core.block_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class WeekendPartTwoTest {

    private final WeekendPartTwo weekend = new WeekendPartTwo();

    @ParameterizedTest
    @MethodSource("getAllNotWeekend")
    @DisplayName("Проверка на выходной день по строке. Варианты с невыходными")
    void checkAllNotWeekend(String value) {
        System.out.println("Проверка на выходной день по строке: " + value);
        assertFalse(assertDoesNotThrow(() -> weekend.isWeekend(value)));
    }

    static Stream<String> getAllNotWeekend() {
        return Stream.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY");
    }

    @ParameterizedTest
    @MethodSource("getAllWeekend")
    @DisplayName("Проверка на выходной день по строке. Варианты с выходными")
    void checkAllWeekend(String value) {
        System.out.println("Проверка на выходной день по строке: " + value);
        assertTrue(assertDoesNotThrow(() -> weekend.isWeekend(value)));
    }

    static Stream<String> getAllWeekend() {
        return Stream.of("SUNDAY", "SATURDAY", "sunday", "saturday", "Sunday", "Saturday");
    }

    @ParameterizedTest
    @MethodSource("getAllWeekendNotValid")
    @DisplayName("Проверка на выходной день по строке. Варианты с невалидными строками")
    void checkAllWeekendNotValid(String value) {
        System.out.println("Проверка на выходной день по строке: " + value);
        assertThrows(IllegalArgumentException.class, () -> weekend.isWeekend(value));
    }

    static Stream<String> getAllWeekendNotValid() {
        return Stream.of("SUDA", "DAY", "sun", "", null, "");
    }

    @Test
    @DisplayName("Проверка количества выходных дней в массиве")
    void weekendCount() {
        Map<Integer, String[]> map = getMapWeekendCount();
        for (Map.Entry<Integer, String[]> entry : map.entrySet()) {
            System.out.println("Проверка количества выходных дней в массиве: " + Arrays.toString(entry.getValue()));
            assertEquals(entry.getKey(), weekend.weekendCount(entry.getValue()));
        }
    }

    private Map<Integer, String[]> getMapWeekendCount() {
        return Map.of(
                6, new String[]{"SUNDAY", "SATURDAY", "sunday", "saturday", "Sunday", "Saturday"},
                3, new String[]{"SUNDAY", "MONDAY", "sunday", "MONDAY", "Sunday", "MONDAY"},
                0, new String[]{"MONDAY", "MONDAY", "MONDAY", "MONDAY", "MONDAY", "MONDAY"},
                1, new String[]{"TUESDAY", "MONDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "Saturday"},
                5, new String[]{"MONDAY", "SATURDAY", "sunday", "saturday", "Sunday", "Saturday"});
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Проверка количества выходных дней в массиве, массив без значений")
    void weekendCount(String[] array) {
        String arrStr = array == null ? null : Arrays.toString(array);
        System.out.println("Проверка количества выходных дней в массиве: " + arrStr);
        assertEquals(0, weekend.weekendCount(array));
    }

    @Test
    @DisplayName("Проверка количества будних дней в массиве")
    void weekdayCount() {
        Map<Integer, String[]> map = getMapWeekdayCount();
        for (Map.Entry<Integer, String[]> entry : map.entrySet()) {
            System.out.println("Проверка количества будних дней в массиве: " + Arrays.toString(entry.getValue()));
            assertEquals(entry.getKey(), weekend.weekdayCount(entry.getValue()));
        }
    }

    private Map<Integer, String[]> getMapWeekdayCount() {
        return Map.of(
                0, new String[]{"SUNDAY", "SATURDAY", "sunday", "saturday", "Sunday", "Saturday"},
                3, new String[]{"SUNDAY", "MONDAY", "sunday", "MONDAY", "Sunday", "MONDAY"},
                6, new String[]{"MONDAY", "monday", "MONDAY", "MONDAY", "MONDAY", "MONDAY"},
                5, new String[]{"TUESDAY", "MONDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "Saturday"},
                1, new String[]{"MONDAY", "SATURDAY", "sunday", "saturday", "Sunday", "Saturday"});
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Проверка количества будних дней в массиве, массив без значений")
    void weekdayCount(String[] array) {
        String arrStr = array == null ? null : Arrays.toString(array);
        System.out.println("Проверка количества будних дней в массиве: " + arrStr);
        assertEquals(0, weekend.weekdayCount(array));
    }
}
