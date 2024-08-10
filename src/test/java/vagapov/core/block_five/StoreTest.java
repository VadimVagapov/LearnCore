package vagapov.core.block_five;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StoreTest {

    private final Store store = new Store();

    @Test
    void getSalesMapTest() {
        String value = """
                Дмитрий 9000
                Вадим 30000
                Алексей 7000
                Вадим 8000
                Алексей 3000
                Дмитрий 9000
                Антон 3000
                Алексей 7000
                Антон 8000
                Даян 3000
                Ильгам 9000
                Антон 2000
                Даян 7000
                Ильгам 8000
                """;

        Map<String, Integer> map =  store.getSalesMap(value);

        assertEquals(map.get("Вадим"), 38000);
        assertEquals(map.get("Дмитрий"), 18000);
        assertEquals(map.get("Алексей"), 14000);
        assertEquals(map.get("Антон"), 13000);
        assertEquals(map.get("Даян"), 10000);
        assertEquals(map.get("Ильгам"), 17000);
    }

    @Test
    void findEmployeesForRaiseTest() {
        Map<String, Integer> empToPercentMap = Map.of(
                "Вадим",    80,
                "Даян",     80,
                "Ильгам",   70,
                "Антон",    35,
                "Алексей",  95,
                "Дмитрий",  60
        );

        Map<String, Integer> empToSalaryMap = Map.of(
                "Вадим",    200000,
                "Даян",     120000,
                "Ильгам",   150000,
                "Антон",    30000,
                "Алексей",  170000,
                "Дмитрий",  90000
        );

        Map<String, Integer> map =  store.findEmployeesForRaise(empToPercentMap, empToSalaryMap);

        assertEquals(map.get("Вадим"), 20000);
        assertNull(map.get("Дмитрий"));
        assertEquals(map.get("Алексей"), 42500);
        assertNull(map.get("Антон"));
        assertEquals(map.get("Даян"), 12000);
        assertEquals(map.get("Ильгам"), 0);
    }
}
