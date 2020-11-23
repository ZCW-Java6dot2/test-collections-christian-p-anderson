package rocks.zipcode;

import java.util.HashSet;
import org.junit.Test;

import static org.junit.Assert.*;


public class HashSetTest {

    @Test
    public void isEmptyTest() {
        HashSet<Integer> testHashSet = new HashSet<>();
        assertTrue(testHashSet.isEmpty());
    }

    @Test
    public void addTest() {
        HashSet<Integer> testHashSet = new HashSet<>();
        testHashSet.add(297);
        assertTrue(testHashSet.contains(297));
    }
}

