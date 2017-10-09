package imperative;

import oo.StackOO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackImperativeTest {

    private StackImperative.StackRepr createOneElementStack() {
        StackImperative.StackRepr stackRepr = StackImperative.stackCreate();
        StackImperative.stackPush(stackRepr, "abc");
        return stackRepr;
    }

    @Test
    public void creatingAStackShouldBeEmpty() {
        StackImperative.StackRepr stackRepr = StackImperative.stackCreate();

        assertEquals("an empty stack should be empty", true, StackImperative.empty(stackRepr));
    }


    @Test
    public void pushAndPopYieldsSameStack() {
        StackImperative.StackRepr<String> stackRepr = createOneElementStack();
        StackImperative.StackRepr<String> stackReprPushPopped = createOneElementStack();
        StackImperative.stackPush(stackReprPushPopped, "secondElement");
        StackImperative.stackPop(stackReprPushPopped);

        assertEquals("pushing and popping an element from a stack should result in the same stack", stackRepr, stackReprPushPopped );
    }

    @Test
    public void popYieldsLastElement() {
        StackImperative.StackRepr<String> stackRepr = StackImperative.stackCreate();
        StackImperative.stackPush(stackRepr, "foo");

        assertEquals("popping an element from a stack should result in the last pushed element", "foo", StackImperative.stackPop(stackRepr));
    }


    @Test
    public void sizeIncreasesByOneAfterPush() {
        StackImperative.StackRepr<String> stackRepr = createOneElementStack();

        assertEquals("stack with one element has size 1", 1, StackImperative.size(stackRepr));
        StackImperative.stackPush(stackRepr, "another element");
        assertEquals("stack increases with 1 after push", 2, StackImperative.size(stackRepr));
    }

    @Test
    public void sizeDecreasesByOneAfterPop() {
        StackImperative.StackRepr<String> stackRepr = createOneElementStack();
        StackImperative.stackPop(stackRepr);
        assertEquals("stack increases with 1 after push", 0, StackImperative.size(stackRepr));
    }

    

}