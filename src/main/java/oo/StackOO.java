package oo;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackOO<E> {

    private  LinkedList<E> list = null;

    public StackOO() { throw new NotImplementedException(); }
    public void push(E value) { throw new NotImplementedException(); }
    public E pop() { throw new NotImplementedException(); }
    public boolean empty() { throw new NotImplementedException(); }
    public int size() { throw new NotImplementedException(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StackOO<?> stackOO = (StackOO<?>) o;

        return list.equals(stackOO.list);
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }
}
