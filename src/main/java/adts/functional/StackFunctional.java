package adts.functional;

import java.util.LinkedList;



public class StackFunctional {

    static class Stack<E> {

        private Stack() { this.data = new LinkedList<E>(); }

        private LinkedList<E> data = null;

        private Stack(LinkedList<E> l) {
            this.data = l;
        }

        Stack immutableAppend(E element) {
            LinkedList<E> newList = (LinkedList<E>) data.clone();
            newList.add(element);
            return new Stack(newList);
        }

        Stack immutableRemoveLast() {
            LinkedList<E> newData = (LinkedList<E>) data.clone();
            newData.remove(newData.getLast());
            return new Stack(newData);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Stack<?> stack = (Stack<?>) o;

            return data.equals(stack.data);
        }

        @Override
        public int hashCode() {
            return data.hashCode();
        }
    }

    public static <E> Stack<E> create() {
        return new Stack<E>();
    }

    public static <E> Stack<E> push(Stack<E> repr, E value) {
        return repr.immutableAppend(value);
    }

    public static <E> Tuple<Stack, E> pop(Stack<E> repr) {
        return new Tuple<Stack, E>(repr.immutableRemoveLast(), repr.data.getLast());
    }

    public static <E> boolean empty(Stack<E> repr) {
        return repr.data == null || repr.data.size() == 0;
    }

    public static <E> E top(Stack<E> repr) {
        return repr.data.getLast();
    }

    public static <E> int size(Stack<E> repr) {
        return repr.data.size();
    }

}
