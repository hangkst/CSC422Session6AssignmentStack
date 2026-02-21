/*
    Kongpheng Samuel Hang, hangk@csp.edu
    CSC 422 100 Software Engineering
    Date: 2/23/2026
*/

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    // Test pushing and popping
    @Test
    public void testPushPop() {
        Stack<Integer> stack = new Stack<>(5);

        // Push items onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Pop items and check order
        assertEquals(Integer.valueOf(5), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    // Test peeking without removing
    @Test
    public void testPeek() {
        Stack<String> stack = new Stack<>(3);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals("C", stack.peek());

        // Peek again to make sure it doesn't remove
        assertEquals("C", stack.peek());
    }

    // Test empty stack exception
    @Test(expected = EmptyStackException.class)
    public void testEmptyStackException() {
        Stack<Double> stack = new Stack<>(2);

        // This should throw the exception
        stack.pop();
    }

    // Test popping empty stack exception
    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStackException() {
        Stack<Double> stack = new Stack<>(2);
        stack.push(3.14);
        stack.pop();

        // This should throw the exception
        stack.pop();
    }

    // Test peeking empty stack exception
    @Test(expected = EmptyStackException.class)
    public void testPeekEmptyStackException() {
        Stack<Double> stack = new Stack<>(2);

        // This should throw the exception
        stack.peek();
    }

    // Test pushing to a full stack exception
    @Test(expected = FullStackException.class)
    public void testFullStackException() {
        Stack<Integer> stack = new Stack<>(2);
        stack.push(10);
        stack.push(20);
        
        // This should throw the exception
        stack.push(30);
    }
}
