package rocks.zipcode;

import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void getTest() {
        LinkedList<Integer> testLinkedList = new LinkedList<>();
        Integer a = 23;
        Integer b = 3;
        Integer c = 9;
        Integer d = 41;
        testLinkedList.add(a);
        testLinkedList.add(b);
        testLinkedList.add(c);
        testLinkedList.add(d);
        assertEquals(c, testLinkedList.get(9));
    }

}
