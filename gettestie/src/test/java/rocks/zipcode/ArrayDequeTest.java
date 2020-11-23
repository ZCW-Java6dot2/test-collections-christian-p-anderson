package rocks.zipcode;

import org.junit.Test;
import java.util.ArrayDeque;
import static org.junit.Assert.*;

public class ArrayDequeTest {

    @Test
    public void isEmptyTest() {
        ArrayDeque<Integer> testArrayDeque = new ArrayDeque<>();
        assertTrue(testArrayDeque.isEmpty());
    }

    @Test
    public void containsTest() {
        ArrayDeque<Integer> testArrayDeque = new ArrayDeque<>();
        Integer a = 83;
        Integer b = 121;
        Integer c = 30;
        testArrayDeque.add(a);
        testArrayDeque.add(b);
        testArrayDeque.add(c);
        assertEquals(3, testArrayDeque.size());
    }

    @Test
    public void popTest() {
        ArrayDeque<Integer> testArrayDeque = new ArrayDeque<>();
        Integer a = 83;
        Integer b = 121;
        Integer c = 30;
        testArrayDeque.add(a);
        testArrayDeque.add(b);
        testArrayDeque.add(c);
        assertEquals(a, testArrayDeque.pop());
    }
}
