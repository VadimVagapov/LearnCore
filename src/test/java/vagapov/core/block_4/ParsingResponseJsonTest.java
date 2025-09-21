package vagapov.core.block_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import vagapov.core.block_4.model.UserResponse;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ParsingResponseJsonTest {
    private final ParsingResponseJson parser = new ParsingResponseJson();

    /**
     * Чтобы протестировать свой функционал раскомментируйте строки
     * @throws IOException
     */
    @Test
    void test() throws IOException {
        UserResponse response = parser.method();

//        assertNotNull(response);
//        assertEquals("SUCCESS", response.getStatus());
//        assertEquals("986432878721", response.getUserId());
//        assertEquals("Иванов Иван Иванович", response.getFullName());
//        assertEquals("Иван", response.getFirstName());
//        assertEquals("Иванов", response.getLastName());
//        assertEquals("Иванович", response.getMiddleName());
//        assertNotNull(response.getDocuments());
//        assertNotNull(response.getAddresses());
//        assertEquals(2, response.getDocuments().size());
//        assertEquals(2, response.getAddresses().size());
//        assertTrue(response.getDocuments().stream().anyMatch(doc -> "true".equals(doc.getIdentification())));
//        assertTrue(response.getDocuments().stream().anyMatch(doc -> "false".equals(doc.getIdentification())));
    }
}
