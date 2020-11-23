package rocks.zipcode;

import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapTest {

    @Test
    public void isEmptyTest() {
        HashMap<Character, Integer> testHashMap = new HashMap<>();
        assertTrue(testHashMap.isEmpty());
    }

    @Test
    public void equalsTest() {
        HashMap<Character, Integer> testHashMap = new HashMap<>();
        Integer a = 26;
        Integer b = 17;
        testHashMap.put('W', a);
        testHashMap.put('E', b);
        assertEquals(a, testHashMap.get('W'));
    }

    @Test
    public void containsKeyTest() {
        HashMap<Character, Integer> testHashMap = new HashMap<>();
        Integer a = 26;
        Integer b = 17;
        testHashMap.put('W', a);
        testHashMap.put('E', b);
        assertTrue(testHashMap.containsKey('E'));
    }

    @Test
    public void containsValueTest() {
        HashMap<Character, Integer> testHashMap = new HashMap<>();
        Integer a = 26;
        Integer b = 17;
        testHashMap.put('W', a);
        testHashMap.put('E', b);
        assertTrue(testHashMap.containsValue(b));
    }

}
