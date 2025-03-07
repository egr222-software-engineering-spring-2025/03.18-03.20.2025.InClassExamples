import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testObjectCreation() {
        Cup c = new Cup("Water", 85.0);
        assertEquals("Water", c.getLiquidType());
    }
}