import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalcuTest {

    PostfixCalcu pos = new PostfixCalcu(1, 1);

    @Test
    void evaluate() {

        assertEquals(9, pos.Evaluate("4 5 +"));

    }
}