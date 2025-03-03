package first_exs.circularList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tests {
    @Test
    public void circularListTest() {
        final CircularList<String> xs = new CircularList<>("one", "two", "three");
        assertThat(xs.next(), is("one"));
        assertThat(xs.next(), is("two"));
        assertThat(xs.next(), is("three"));
        assertThat(xs.next(), is("one"));
        assertThat(xs.prev(), is("three"));
        assertThat(xs.prev(), is("two"));
        assertThat(xs.prev(), is("one"));
        assertThat(xs.prev(), is("three"));

        final CircularList<Integer> ys = new CircularList<>(1, 2, 3, 4, 5);
        assertThat(ys.prev(), is(5));
        assertThat(ys.prev(), is(4));
        assertThat(ys.next(), is(5));
        assertThat(ys.next(), is(1));
        assertThat(ys.next(), is(2));
        assertThat(ys.next(), is(3));
        assertThat(ys.next(), is(4));
        assertThat(ys.prev(), is(3));
        assertThat(ys.prev(), is(2));
        assertThat(ys.next(), is(3));
        assertThat(ys.next(), is(4));
        assertThat(ys.next(), is(5));
        assertThat(ys.next(), is(1));
        assertThat(ys.next(), is(2));
        assertThat(ys.next(), is(3));
    }
}