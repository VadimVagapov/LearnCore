package vagapov.core.block_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class GoodListTest {

    private static final String MESSAGE = "Пришел вот такой список: %s\nА ожидался вот такой: %s\n";

    private final GoodList goodList = new GoodList();

    @Test
    void deleteDuplicatesTest() {
        List<String> list1 = List.of("a", "b", "c", "d", "e", "f", "a", "b", "c", "d", "e", "f");
        List<String> list2 = List.of("a", "A", "a", "a", "Ae", "aa", "", "", " ", " ", ".", ".");
        List<String> list3 = List.of("1", "2", "3", "11", " ", " ", "3", "3", "4", "5", "e", "e");

        List<String> listExpected1 = List.of("a", "b", "c", "d", "e", "f");
        List<String> listExpected2 = List.of("a", "A", "Ae", "aa", "", " ", ".");
        List<String> listExpected3 = List.of("1", "2", "3", "11", " ", "4", "5", "e");

        List<String> list1Result = goodList.deleteDuplicates(list1);
        List<String> list2Result = goodList.deleteDuplicates(list2);
        List<String> list3Result = goodList.deleteDuplicates(list3);

        assertEquals(listExpected1, list1Result, MESSAGE.formatted(list1Result.toString(), listExpected1.toString()));
        assertEquals(listExpected2, list2Result, MESSAGE.formatted(list2Result.toString(), listExpected2.toString()));
        assertEquals(listExpected3, list3Result, MESSAGE.formatted(list3Result.toString(), listExpected3.toString()));
    }

    @Test
    void getSortListAscTest() {
        List<String> list1 = List.of("a", "b", "c", "d", "e", "f", "a", "b", "c", "d", "e", "f");
        List<String> list2 = List.of("a", "A", "a", "a", "Ae", "aa", "", "", " ", " ", ".", ".");
        List<String> list3 = List.of("1", "2", "3", "11", " ", " ", "3", "3", "4", "5", "e", "e");

        List<String> listExpected1 = List.of("a", "a", "b", "b", "c", "c", "d", "d", "e", "e", "f", "f");
        List<String> listExpected2 = List.of("", "", " ", " ", ".", ".", "A", "Ae", "a", "a", "a", "aa");
        List<String> listExpected3 = List.of(" ", " ", "1", "11", "2", "3", "3", "3", "4", "5", "e", "e");

        List<String> list1Result = goodList.getSortListAsc(list1);
        List<String> list2Result = goodList.getSortListAsc(list2);
        List<String> list3Result = goodList.getSortListAsc(list3);

        assertEquals(listExpected1, list1Result, MESSAGE.formatted(list1Result.toString(), listExpected1.toString()));
        assertEquals(listExpected2, list2Result, MESSAGE.formatted(list2Result.toString(), listExpected2.toString()));
        assertEquals(listExpected3, list3Result, MESSAGE.formatted(list3Result.toString(), listExpected3.toString()));
    }

    @Test
    void findIdenticalElementsTest() {
        List<String> list1 = List.of("a", "b", "c", "d", "e", "f");
        List<String> list2 = List.of("a", "A", "b", "a", "Ae", "aa", "", "", " ", "f", ".", ".");
        List<String> list3 = List.of("1", "2", "3", "11", " ", " ", "3", "3", "4", "5", "e", "e");
        List<String> list4 = List.of("3", "2", "1", "12", " ", " ", "3", "7", "6", "5", "d", "e");

        List<String> listExpected1 = List.of("a", "b", "f");
        List<String> listExpected2 = List.of("1", "2", "3", " ", "5", "e");

        List<String> list1Result = goodList.findIdenticalElements(list1, list2);
        List<String> list2Result = goodList.findIdenticalElements(list3, list4);

        assertEquals(listExpected1, list1Result, MESSAGE.formatted(list1Result.toString(), listExpected1.toString()));
        assertEquals(listExpected2, list2Result, MESSAGE.formatted(list2Result.toString(), listExpected2.toString()));
    }

}
