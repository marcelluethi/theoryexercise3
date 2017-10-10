package adts.functional;

/**
 * Implementation from https://alvinalexander.com/java/java-tuple-classes
 */
public class Tuple<A, B> {

    public final A first;
    public final B second;

    public Tuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        if (!first.equals(tuple.first)) return false;
        return second.equals(tuple.second);
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }
}
