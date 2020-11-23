package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @org.junit.Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        assertEquals(true, stack.isEmpty());
        stack.push("Jello World");
        assertEquals(false, stack.isEmpty());
        assertEquals("Jello World", stack.peek());
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }
}
