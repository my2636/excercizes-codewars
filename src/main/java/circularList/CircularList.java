package circularList;

public class CircularList<T> {

    private T[] elements;
    int cursor = -1;

    public CircularList(final T... elements) {
        if(elements.length == 0) {throw new IllegalArgumentException("No arguments");}
            this.elements = elements;
    }

    T next() {
        if(cursor >= elements.length - 1) {
            cursor = -1;
        }
        return elements[++cursor];
    }

    T prev() {
        if(cursor <= 0) {
            cursor = elements.length;
        }
        return elements[--cursor];
    }
}// shoto