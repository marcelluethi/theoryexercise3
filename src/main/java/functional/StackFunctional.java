package functional;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;



public class StackFunctional {

    static class StackRepr<E> {
        private LinkedList<E> list = null;

        StackRepr() { new StackRepr(new LinkedList<E>()); }
        public StackRepr(LinkedList<E> l) {
            this.list = l;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StackRepr<?> stackRepr = (StackRepr<?>) o;

            return list.equals(stackRepr.list);
        }

        @Override
        public int hashCode() {
            return list.hashCode();
        }
    }


    public static <E> StackRepr<E> stackPush(StackRepr<E> repr, E value) {throw new NotImplementedException(); }
    public static <E> Tuple<StackRepr, E> stackPop(StackRepr<E> repr) {throw new NotImplementedException(); }
    public static <E> boolean empty(StackRepr<E> repr) { throw new NotImplementedException(); }
    public static <E> E stackTop(StackRepr<E> repr) { throw new NotImplementedException(); }
    public static <E> int size(StackRepr<E> repr) { throw new NotImplementedException(); }

}
