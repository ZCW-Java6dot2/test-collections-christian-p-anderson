package rocks.zipcode;

import org.junit.Test;
import java.util.PriorityQueue;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void equalsTest1() {
        PriorityQueue<Integer> testPriorityQueue = new PriorityQueue<>();
        testPriorityQueue.add(244);
        testPriorityQueue.add(83);
        testPriorityQueue.add(12);
        Integer a = 83;
        Integer b = 244;
        Integer c = 12;

        assertEquals(c, testPriorityQueue.poll());
    }

    @Test
    public void equalsTest2() {
        PriorityQueue<Integer> testPriorityQueue = new PriorityQueue<>();
        testPriorityQueue.add(244);
        testPriorityQueue.add(83);
        testPriorityQueue.add(12);
        Integer a = 83;
        Integer b = 244;
        Integer c = 12;

        assertEquals(c, testPriorityQueue.poll());
        assertEquals(a, testPriorityQueue.poll());
    }

    @Test
    public void containsTest() {
        PriorityQueue<Integer> testPriorityQueue = new PriorityQueue<>();
        testPriorityQueue.add(244);
        testPriorityQueue.add(83);
        testPriorityQueue.add(12);
        Integer a = 83;
        Integer b = 244;
        Integer c = 12;

        assertTrue(testPriorityQueue.contains(12));
    }
}
