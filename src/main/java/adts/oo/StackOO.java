package adts.oo;

import java.util.LinkedList;

public class StackOO<E> {

    private  LinkedList<E> data = null;

    public StackOO() { data =  new LinkedList<E>(); }

    public void push(E value) { data.add(value); }

    public E pop() {
        E last = data.getLast();
        data.remove(last);
        return last;
    }

    public boolean empty() { return data == null || data.size() == 0; }

    public int size() { return data.size(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StackOO<?> stackOO = (StackOO<?>) o;

        return data.equals(stackOO.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
