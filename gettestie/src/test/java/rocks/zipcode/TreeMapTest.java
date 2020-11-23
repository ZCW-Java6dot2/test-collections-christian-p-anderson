package rocks.zipcode;

import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class TreeMapTest {

    @Test
    public void equalsTest() {
        TreeMap<Integer, String> testTreeMap = new TreeMap<>();
        testTreeMap.put(2, "val");
        testTreeMap.put(89, "val");
        testTreeMap.put(19, "val");
        testTreeMap.put(65, "val");

        String expected = "[2, 19, 65, 89]";

        assertEquals(expected, testTreeMap.keySet().toString());
    }
}
