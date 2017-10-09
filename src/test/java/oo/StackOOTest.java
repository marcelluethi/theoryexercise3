package oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackOOTest {

    private StackOO<String> createOneElementStack() {
        StackOO<String> stack = new StackOO<String>();
        stack.push("first element");
        return stack;
    }

    @Test
    public void creatingAStackShouldBeEmpty() {
        StackOO emptyStack = new StackOO<String>() ;

        assertEquals("an empty stack should be empty", true, emptyStack.empty());
    }


    @Test
    public void pushAndPopYieldsSameStack() {
        StackOO stack = createOneElementStack();
        StackOO stackPushPopped = createOneElementStack();
        stackPushPopped.push("secondElement");
        stackPushPopped.pop();

        assertEquals("pushing and popping an element from a stack should result in the same stack", stack, stackPushPopped );
    }

    @Test
    public void popYieldsLastElement() {
        StackOO stack = new StackOO();
        stack.push("foo");

        assertEquals("popping an element from a stack should result in the last pushed element", "foo", stack.pop());
    }


    @Test
    public void sizeIncreasesByOneAfterPush() {
        StackOO stack = createOneElementStack();

        assertEquals("stack with one element has size 1", 1, stack.size());
        stack.push("another element");
        assertEquals("stack increases with 1 after push", 2, stack.size());

    }

    @Test
    public void sizeDecreasesByOneAfterPop() {
        StackOO stack = createOneElementStack();
        stack.pop();
        assertEquals("stack increases with 1 after push", 0, stack.size());
    }



}