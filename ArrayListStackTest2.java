import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListStackTest2 {

    ArrayListStack<Integer> arraylist = new ArrayListStack<>();

    @Test
    void count() {
        assertEquals(0, arraylist.count());
    }

    @Test
    void isEmpty() {
        assertEquals(true, arraylist.isEmpty());
    };

    @Test
    void push() {
        arraylist.push(4);
        assertEquals(4, arraylist.peek());
    }

    @Test
    void pull() {
        arraylist.push(4);
        arraylist.pull();
        assertEquals(true, arraylist.isEmpty());
    }

    @Test
    void peek() {
        arraylist.push(5);
        assertEquals(5, arraylist.peek());
    }
}