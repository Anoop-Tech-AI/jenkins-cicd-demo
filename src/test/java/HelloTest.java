import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void testMessage() {
        assertEquals("Hello Jenkins CI/CD!", Hello.message());
    }
}