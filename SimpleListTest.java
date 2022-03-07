import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleListTest {

    SimpleList<Integer> sl = new SimpleList<>();

    @Test
    void insertAtStart() {
        sl.InsertAtStart(1);
        assertEquals(1, sl.Get(0));
    }

    @Test
    void insertAtEnd() {
        sl.InsertAtEnd(1);
        sl.InsertAtEnd(2);
        assertEquals(2, sl.Get(1));
    }

    @Test
    void insert() {
        sl.Insert(1, 0);
        sl.Insert(2, 1);
        assertEquals(2, sl.Get(1));
    }

    @Test
    void delete() {
        sl.InsertAtStart(1);
        sl.Delete(0);
        assertEquals(0, sl.Count());
    }

    @Test
    void deleteAtStart() {
        sl.InsertAtStart(1);
        sl.DeleteAtStart();
        assertEquals(0, sl.Count());
    }

    @Test
    void deleteAtEnd() {
        sl.InsertAtEnd(1);
        sl.DeleteAtEnd();
        assertEquals(0, sl.Count());
    }

    @Test
    void get() {
        sl.InsertAtStart(1);
        assertEquals(1 , sl.Get(0));
    }

    @Test
    void isEmpty() {
        assertEquals(true, sl.IsEmpty());
    }

    @Test
    void count() {
    }
}