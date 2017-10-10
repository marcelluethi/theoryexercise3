package adts.imperative;


import java.util.LinkedList;


class StackImperative {

    static class StackRepr<E> {
        private LinkedList<E> data = new LinkedList<E>();

        private StackRepr() {
            this.data = new LinkedList<E>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StackRepr<?> stackRepr = (StackRepr<?>) o;

            return data != null ? data.equals(stackRepr.data) : stackRepr.data == null;
        }

        @Override
        public int hashCode() {

            int result = (data != null ? data.hashCode() : 0);
            return result;
        }
    }

    public static <E> StackRepr<E> stackCreate() {
        return new StackRepr<>();
    }

    public static <E> void stackPush(StackRepr<E> repr, E value) {
        repr.data.add(value);
    }

    public static <E> E stackPop(StackRepr<E> repr) {
        E last = repr.data.getLast();
        repr.data.remove(last);
        return last;
    }

    public static <E> boolean empty(StackRepr<E> repr) {
        return (repr.data == null || repr.data.size() == 0);
    }
    public static <E> E stackTop(StackRepr<E> repr) {
        return repr.data.getLast();
    }

    public static <E> int size(StackRepr<E> repr) {
        return repr.data.size();
    }
}
