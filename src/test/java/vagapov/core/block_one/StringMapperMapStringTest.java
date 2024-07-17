package vagapov.core.block_one;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static vagapov.core.block_one.StringMapper.MESSAGE;

@ExtendWith(MockitoExtension.class)
public class StringMapperMapStringTest {

    StringMapper mapper = new StringMapper();

    @Test
    @DisplayName("Преобразование строки в число когда входное значение не является числом")
    void mapString2Number_whenStringNotNumber() {
        NumberFormatException ex = assertThrows(NumberFormatException.class, () -> mapper.mapString2Number("траляля"));
        assertEquals(MESSAGE, ex.getMessage());
    }

    @Test
    @DisplayName("Преобразование строки в число когда входное значение null")
    void mapString2Number_whenStringIsNull() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> mapper.mapString2Number(null));
        assertEquals(MESSAGE, ex.getMessage());
    }

    @Test
    @DisplayName("Преобразование строки в число когда входное значение типа Long")
    void mapString2Number_whenStringIsLong() {
        Long i = 98692186498642L;
        Number number = assertDoesNotThrow(() -> mapper.mapString2Number(i.toString()));
        assertEquals(i, number);
    }

    @Test
    @DisplayName("Преобразование строки в число когда входное значение типа Short")
    void mapString2Number_whenStringIsShort() {
        Short i = 128;
        Number number = assertDoesNotThrow(() -> mapper.mapString2Number(i.toString()));
        assertEquals((long) i, number);
    }

    @Test
    @DisplayName("Преобразование строки в число когда входное значение является слишком большим числом")
    void mapString2Number_whenStringToLong() {
        NumberFormatException ex = assertThrows(NumberFormatException.class, () -> mapper.mapString2Number("9879879879879877998"));
        assertEquals(MESSAGE, ex.getMessage());
    }

}
