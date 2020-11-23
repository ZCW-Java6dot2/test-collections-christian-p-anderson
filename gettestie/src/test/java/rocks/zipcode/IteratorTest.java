package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class IteratorTest {
    private static final Logger LOGGER = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testIterator() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("What");
        treeSet.add("is");
        treeSet.add("your name?");
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            LOGGER.info("\n" + itr.next());
        }
    }
}
