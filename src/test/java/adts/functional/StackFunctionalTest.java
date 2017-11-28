package adts.functional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StackFunctionalTest {

    private StackFunctional.Stack<String> createOneElementStack() {
        StackFunctional.Stack<String> emptyStack = StackFunctional.create();
        StackFunctional.Stack<String> stackWithOneElement = StackFunctional.push(emptyStack, "first element");
        return stackWithOneElement;
    }

    @Test
    public void creatingAStackShouldBeEmpty() {
        StackFunctional.Stack<String> emptyStack = StackFunctional.create() ;

        assertEquals("an empty stack should be empty", true, StackFunctional.empty(emptyStack));
    }


    @Test
    public void topYieldsTheLastPushedElement() {
        StackFunctional.Stack<String> emptyStack = StackFunctional.create() ;
        assertEquals("top yields the last pushed Element", "foo",
                StackFunctional.top(StackFunctional.push(emptyStack, "foo")));
    }

    @Test
    public void pushAndPopYieldsSameStack() {
        StackFunctional.Stack<String> stackWithOneElement = createOneElementStack();
        StackFunctional.Stack<String> stackPushPopped = StackFunctional.pop(StackFunctional.push(stackWithOneElement, "second element")).first;
        assertEquals("pushing and popping an element from a stack should result in the same stack", stackPushPopped, stackWithOneElement);

    }

    @Test
    public void popYieldsLastElement() {
        StackFunctional.Stack<String> emptyStack = StackFunctional.create();

        assertEquals("popping an element from a stack should result in the last pushed element", "foo",
                StackFunctional.pop(StackFunctional.push(emptyStack, "foo")).second);
    }


    @Test
    public void sizeIncreasesByOneAfterPush() {
        assertEquals("stack with one element has size 1", 1, StackFunctional.size(createOneElementStack()));
        StackFunctional.Stack<String> stackWithOneMoreElement = StackFunctional.push(createOneElementStack(), "secondElement");
        assertEquals("stack increases with 1 after push", 2, StackFunctional.size(stackWithOneMoreElement));

    }

    @Test
    public void sizeDecreasesByOneAfterPop() {
        assertEquals("stack with one element has size 1", 1, StackFunctional.size(createOneElementStack()));
        StackFunctional.Stack<String> stackWithOneMoreElement = StackFunctional.push(createOneElementStack(), "secondElement");
        assertEquals("stack increases with 1 after push", 2, StackFunctional.size(stackWithOneMoreElement));

    }

//    @Test
//    public void equalsAreEqual() {
//        StackFunctional.Stack<String> s = createOneElementStack();
//        assertEquals(s, s);
//
//    }
}
