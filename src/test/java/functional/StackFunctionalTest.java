package functional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StackFunctionalTest {

    private StackFunctional.StackRepr<String> createOneElementStack() {
        StackFunctional.StackRepr<String> emptyStack = new StackFunctional.StackRepr<String>();
        StackFunctional.StackRepr<String> stackWithOneElement = StackFunctional.stackPush(emptyStack, "first element");
        return stackWithOneElement;
    }

    @Test
    public void creatingAStackShouldBeEmpty() {
        StackFunctional.StackRepr<String> emptyStack = new StackFunctional.StackRepr<String>() ;

        assertEquals("an empty stack should be empty", true, StackFunctional.empty(emptyStack));
    }


    @Test
    public void pushAndPopYieldsSameStack() {
        StackFunctional.StackRepr<String> stackWithOneElement = createOneElementStack();
        StackFunctional.StackRepr<String> stackPushPopped = StackFunctional.stackPop(StackFunctional.stackPush(stackWithOneElement, "second element")).first;
        assertEquals("pushing and popping an element from a stack should result in the same stack", stackPushPopped, stackWithOneElement);

    }

    @Test
    public void popYieldsLastElement() {
        StackFunctional.StackRepr<String> emptyStack = new StackFunctional.StackRepr<String>();

        assertEquals("popping an element from a stack should result in the last pushed element", "foo",
                StackFunctional.stackPop(StackFunctional.stackPush(emptyStack, "foo")).second);
    }


    @Test
    public void sizeIncreasesByOneAfterPush() {
        assertEquals("stack with one element has size 1", 1, StackFunctional.size(createOneElementStack()));
        StackFunctional.StackRepr<String> stackWithOneMoreElement = StackFunctional.stackPush(createOneElementStack(), "secondElement");
        assertEquals("stack increases with 1 after push", 2, StackFunctional.size(stackWithOneMoreElement));

    }

    @Test
    public void sizeDecreasesByOneAfterPop() {
        assertEquals("stack with one element has size 1", 1, StackFunctional.size(createOneElementStack()));
        StackFunctional.StackRepr<String> stackWithOneMoreElement = StackFunctional.stackPush(createOneElementStack(), "secondElement");
        assertEquals("stack increases with 1 after push", 2, StackFunctional.size(stackWithOneMoreElement));

    }

}
