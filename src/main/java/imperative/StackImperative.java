package imperative;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;



class StackImperative {

    static class StackRepr<E> {
        private int StackPointer;
        private ArrayList<E> data = new ArrayList<E>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StackRepr<?> stackRepr = (StackRepr<?>) o;

            if (StackPointer != stackRepr.StackPointer) return false;
            return data != null ? data.equals(stackRepr.data) : stackRepr.data == null;
        }

        @Override
        public int hashCode() {
            int result = StackPointer;
            result = 31 * result + (data != null ? data.hashCode() : 0);
            return result;
        }
    }

    public static <E> StackRepr<E> stackCreate() { throw new NotImplementedException(); }
    public static <E> void stackPush(StackRepr<E> repr, E value) {throw new NotImplementedException(); }
    public static <E> E stackPop(StackRepr<E> repr) {throw new NotImplementedException(); }
    public static <E> boolean empty(StackRepr<E> repr) { throw new NotImplementedException(); }
    public static <E> E stackTop(StackRepr<E> repr) { throw new NotImplementedException(); }
    public static <E> int size(StackRepr<E> repr) { throw new NotImplementedException(); }
}
