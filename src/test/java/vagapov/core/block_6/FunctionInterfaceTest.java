package vagapov.core.block_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import vagapov.core.block_6.model.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FunctionInterfaceTest {

    private final FunctionInterface functionInterface = new FunctionInterface();
    private static final String MESSAGE = "Сравнивали вот эти два обьекта: 1 = %s\n и 2 = %s\nДолжно было вернуться: %s";

    @Test
    void sqrtTest() {
        Integer apply2 = (Integer) functionInterface.sqrt().apply(2);
        Integer apply4 = (Integer) functionInterface.sqrt().apply(4);
        Integer apply6 = (Integer) functionInterface.sqrt().apply(6);

        assertEquals(4, apply2);
        assertEquals(16, apply4);
        assertEquals(36, apply6);
    }

    @Test
    void getStringTest() {
        String apply = (String) functionInterface.getString().apply(List.of("Stringa", "Stringb", "Stringc"));
        assertEquals("[Stringa, Stringb, Stringc]", apply);

        String apply2 = (String) functionInterface.getString().apply(null);
        assertEquals("", apply2);

        String apply3 = (String) functionInterface.getString().apply(12);
        assertEquals("12", apply3);
    }

    @Test
    void sortUserByUserRightTest() {
        User user1 = getUserWithRight(3, false);
        User user2 = getUserWithRight(3, true);

        User apply1 = (User) functionInterface.sortUserByUserRight().apply(user1, user2);

        assertEquals(user2, apply1, MESSAGE.formatted(user1, user2, user2));

        /*-----------------------*/
        User user11 = getUserWithRight(3, true);
        User user22 = getUserWithRight(2, true);

        User apply2 = (User) functionInterface.sortUserByUserRight().apply(user11, user22);

        assertEquals(user11, apply2, MESSAGE.formatted(user11, user22, user11));

        /*-----------------------*/
        User user111 = getUserWithRight(3, false);
        User user222 = getUserWithRight(4, false);

        User apply3 = (User) functionInterface.sortUserByUserRight().apply(user111, user222);

        assertEquals(user222, apply3, MESSAGE.formatted(user222, user111, user222));

        /*-----------------------*/
        User user1111 = null;
        User user2222 = getUserWithRight(4, false);

        User apply4 = (User) functionInterface.sortUserByUserRight().apply(user1111, user2222);

        assertEquals(user2222, apply4, MESSAGE.formatted(user2222, user1111, user2222));
    }

    @Test
    void sortUserByUserNameTest() {
        User user1 = getUserWithName("Абдрахман");
        User user2 = getUserWithName("Вадим");

        User apply1 = (User) functionInterface.sortUserByUserName().apply(user1, user2);

        assertEquals(user1, apply1, MESSAGE.formatted(user1, user2, user1));

        /*-----------------------*/
        User user11 = getUserWithName("Даян");
        User user22 = getUserWithName("Ильгам");

        User apply2 = (User) functionInterface.sortUserByUserName().apply(user11, user22);

        assertEquals(user11, apply2, MESSAGE.formatted(user11, user22, user11));

        /*-----------------------*/
        User user111 = getUserWithName("Ильнур");
        User user222 = getUserWithName("Ильгам");

        User apply3 = (User) functionInterface.sortUserByUserName().apply(user111, user222);

        assertEquals(user222, apply3, MESSAGE.formatted(user222, user111, user222));

        /*-----------------------*/
        User user1111 = null;
        User user2222 = getUserWithName("Вадим");

        User apply4 = (User) functionInterface.sortUserByUserName().apply(user1111, user2222);

        assertEquals(user2222, apply4, MESSAGE.formatted(user2222, user1111, user2222));
    }

    private User getUserWithRight(int sizeRight, boolean isOwner) {
        User user = new User();
        List<String> rights = new ArrayList<>();
        for (int i = 0; i < sizeRight; i++) {
            rights.add("Right" + i);
        }
        if (isOwner) {
            rights.add("Owner");
        }
        user.setRights(rights);
        return user;
    }

    private User getUserWithName(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }
}
