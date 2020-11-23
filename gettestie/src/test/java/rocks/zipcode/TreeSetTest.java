package rocks.zipcode;

import org.junit.Test;
import java.util.TreeSet;
import static org.junit.Assert.*;

public class TreeSetTest {

    @Test
    public void containsTest() {
        TreeSet<String> testTreeSet = new TreeSet<>();
        testTreeSet.add("1");
        testTreeSet.add("12");
        testTreeSet.add("76");
        assertTrue(testTreeSet.contains("76"));
        assertFalse(testTreeSet.contains("687"));
    }

    @Test
    public void isEmptyTest() {
        TreeSet<String> testTreeSet = new TreeSet<>();
        assertTrue(testTreeSet.isEmpty());
        testTreeSet.add("a");
        assertFalse(testTreeSet.isEmpty());
    }
}
