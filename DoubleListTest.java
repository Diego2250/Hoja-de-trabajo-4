import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListTest {
    DoubleList<Double> dl = new DoubleList<>();

    @Test
    void insertAtStart() {
        dl.InsertAtStart( 4.0);
        dl.InsertAtStart(5.0);
        assertEquals(5.0, dl.Get(0));
    }

    @Test
    void insertAtEnd() {
        dl.InsertAtStart( 4.0);
        dl.InsertAtEnd(5.0);
        assertEquals(5.0, dl.Get(1));
    }

    @Test
    void insert() {
        dl.Insert(4.0, 0);
        assertEquals(4.0, dl.Get(0));

    }

    @Test
    void deleteAtStart() {
        dl.InsertAtStart(4.0);
        dl.DeleteAtStart();
        assertEquals(true, dl.IsEmpty());

    }

    @Test
    void get() {
        dl.InsertAtStart(5.0);
        assertEquals(5.0, dl.Get(0));
    }

    @Test
    void isEmpty() {
        assertEquals(true, dl.IsEmpty());
    }

    @Test
    void count() {
        assertEquals(0, dl.Count());
    }
}