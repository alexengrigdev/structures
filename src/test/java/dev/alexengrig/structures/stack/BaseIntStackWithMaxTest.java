package dev.alexengrig.structures.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class BaseIntStackWithMaxTest {
    protected abstract IntStackWithMax create();

    @Test
    public void should_return_max() {
        IntStackWithMax stack = create();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        assertEquals(3, stack.size());
        assertEquals(3, stack.max());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.max());
        assertEquals(1, stack.pop());
        assertEquals(2, stack.max());
        assertEquals(2, stack.pop());
    }
}
