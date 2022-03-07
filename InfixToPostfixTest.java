import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {

    InfixToPostfix inf = new InfixToPostfix(1, 1);

    @Test
    void converter() {
        assertEquals("45+", inf.converter("4+5"));
    }
}