package vagapov.core.block_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import vagapov.core.block_4.model.UserResponse;

import javax.xml.bind.JAXBException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ParsingResponseXmlTest {

    private final ParsingResponseXml parser = new ParsingResponseXml();

    /**
     * Чтобы протестировать свой функционал раскомментируйте строки
     * @throws JAXBException
     */
    @Test
    void test() throws JAXBException {
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
