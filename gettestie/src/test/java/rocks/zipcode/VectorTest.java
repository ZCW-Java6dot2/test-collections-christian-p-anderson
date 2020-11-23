package rocks.zipcode;

import org.junit.Test;
import java.util.Vector;
import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void isEmptyTest() {
        Vector<Integer> testVector = new Vector<>();
        assertTrue(testVector.isEmpty());
    }

    @Test
    public void getTest() {
        Vector<Integer> testVector = new Vector<>();
        Integer a = 30;
        Integer b = 49;
        Integer c = 36;
        testVector.add(a);
        testVector.add(b);
        testVector.add(c);
        assertEquals(b, testVector.get(1));
    }

    @Test
    public void capacityTest() {
        Vector<Integer> testVector = new Vector<>();
        assertEquals(10, testVector.capacity());
    }
}
