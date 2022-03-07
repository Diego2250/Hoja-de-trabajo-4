import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorStackTest {

    VectorStack<Integer> vt = new VectorStack<>();

    @Test
    void push() {
        vt.push(1);
        assertEquals(1, vt.peek());
    }

    @Test
    void pull() {
        vt.push(1);
        assertEquals(1, vt.pull());
    }

    @Test
    void count() {
        assertEquals(0, vt.count());
    }

    @Test
    void isEmpty() {
        assertEquals(true, vt.isEmpty());
    }
}