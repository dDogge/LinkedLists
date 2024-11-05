package linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

public class DoubleLinkedListTest {
    private DoubleLinkedList<Integer> intlist;
    private DoubleLinkedList<String> stringlist;
    private DoubleLinkedList<Character> charlist;

    @BeforeEach
    public void setUp() {
        intlist = new DoubleLinkedList<>();
        stringlist = new DoubleLinkedList<>();
        charlist = new DoubleLinkedList<>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(intlist.isEmpty());
        intlist.addFirst(1);
        assertFalse(intlist.isEmpty());

        assertTrue(stringlist.isEmpty());
        stringlist.addFirst("abc");
        assertFalse(stringlist.isEmpty());

        assertTrue(charlist.isEmpty());
        charlist.addFirst('a');
        assertFalse(charlist.isEmpty());
    }

    @Test
    public void testAddFirst() {
        intlist.addFirst(1);
        intlist.addFirst(2);
        assertEquals(2, intlist.getFirst());

        stringlist.addFirst("abc");
        stringlist.addFirst("bca");
        assertEquals("bca", stringlist.getFirst());

        charlist.addFirst('a');
        charlist.addFirst('b');
        assertEquals('b', charlist.getFirst());
    }

    @Test
    public void testAddLast() {
        intlist.addLast(1);
        intlist.addLast(2);
        assertEquals(2, intlist.getLast());

        stringlist.addLast("abc");
        stringlist.addLast("bca");
        assertEquals("bca", stringlist.getLast());

        charlist.addLast('a');
        charlist.addLast('b');
        assertEquals('b', charlist.getLast());
    }

    @Test
    public void testAddAtIndex() {
        intlist.addFirst(1);
        intlist.addLast(3);
        intlist.add(2, 1);
        assertEquals(2, intlist.get(1));
        assertEquals(3, intlist.get(2));

        stringlist.addFirst("abc");
        stringlist.addLast("cab");
        stringlist.add("bca", 1);
        assertEquals("bca", stringlist.get(1));
        assertEquals("cab", stringlist.get(2));

        charlist.addFirst('a');
        charlist.addLast('c');
        charlist.add('b', 1);
        assertEquals('b', charlist.get(1));
        assertEquals('c', charlist.get(2));
    }

    @Test
    public void testRemoveFirst() {
        intlist.addFirst(1);
        intlist.addLast(2);
        intlist.removeFirst();
        ;
        assertEquals(2, intlist.getFirst());

        stringlist.addFirst("abc");
        stringlist.addLast("bca");
        stringlist.removeFirst();
        assertEquals("bca", stringlist.getFirst());

        charlist.addFirst('a');
        charlist.addLast('b');
        charlist.removeFirst();
        assertEquals('b', charlist.getFirst());
    }

    @Test
    public void testRemoveLast() {
        intlist.addFirst(1);
        intlist.addLast(2);
        intlist.removeLast();
        ;
        assertEquals(1, intlist.getLast());

        stringlist.addFirst("abc");
        stringlist.addLast("bca");
        stringlist.removeLast();
        assertEquals("abc", stringlist.getLast());

        charlist.addFirst('a');
        charlist.addLast('b');
        charlist.removeLast();
        assertEquals('a', charlist.getLast());
    }

    @Test
    public void testRemoveAtIndex() {
        intlist.addLast(1);
        intlist.addLast(2);
        intlist.addLast(3);
        intlist.removeAt(1);
        assertEquals(3, intlist.get(1));

        stringlist.addLast("abc");
        stringlist.addLast("bca");
        stringlist.addLast("cab");
        stringlist.removeAt(1);
        assertEquals("cab", stringlist.get(1));

        charlist.addLast('a');
        charlist.addLast('b');
        charlist.addLast('c');
        charlist.removeAt(1);
        assertEquals('c', charlist.get(1));
    }

    @Test
    public void testSwap() {
        intlist.addLast(1);
        intlist.addLast(2);
        intlist.addLast(3);
        intlist.swap(0, 2);
        assertEquals(3, intlist.getFirst());
        assertEquals(1, intlist.getLast());

        stringlist.addLast("abc");
        stringlist.addLast("bca");
        stringlist.addLast("cab");
        stringlist.swap(0, 2);
        assertEquals("cab", stringlist.getFirst());
        assertEquals("abc", stringlist.getLast());

        charlist.addLast('a');
        charlist.addLast('b');
        charlist.addLast('c');
        charlist.swap(0, 2);
        assertEquals('c', charlist.getFirst());
        assertEquals('a', charlist.getLast());
    }

    @Test
    public void testExists() {
        intlist.addLast(1);
        intlist.addLast(2);
        intlist.addLast(3);
        assertTrue(intlist.exists(2));
        assertFalse(intlist.exists(4));

        stringlist.addLast("abc");
        stringlist.addLast("bca");
        stringlist.addLast("cab");
        assertTrue(stringlist.exists("bca"));
        assertFalse(stringlist.exists("DDD"));

        charlist.addLast('a');
        charlist.addLast('b');
        charlist.addLast('c');
        assertTrue(charlist.exists('b'));
        assertFalse(charlist.exists('d'));
    }

    @Test
    public void testSort() {
        intlist.addLast(3);
        intlist.addLast(1);
        intlist.addLast(2);
        Comparator<Integer> intComp = Integer::compare;
        intlist.Sort(intComp);
        assertEquals(1, intlist.get(0));
        assertEquals(2, intlist.get(1));
        assertEquals(3, intlist.get(2));

        stringlist.addLast("cab");
        stringlist.addLast("abc");
        stringlist.addLast("bca");
        Comparator<String> stringComp = String::compareTo;
        stringlist.Sort(stringComp);
        assertEquals("abc", stringlist.get(0));
        assertEquals("bca", stringlist.get(1));
        assertEquals("cab", stringlist.get(2));

        charlist.addLast('c');
        charlist.addLast('a');
        charlist.addLast('b');
        Comparator<Character> charComp = Character::compare;
        charlist.Sort(charComp);
        assertEquals('a', charlist.get(0));
        assertEquals('b', charlist.get(1));
        assertEquals('c', charlist.get(2));
    }

    @Test
    public void testclear() {
        intlist.addLast(1);
        intlist.addLast(2);
        intlist.addLast(3);
        intlist.clear();
        assertTrue(intlist.isEmpty());
        assertEquals(0, intlist.size());

        stringlist.addLast("abc");
        stringlist.addLast("bca");
        stringlist.addLast("cab");
        stringlist.clear();
        assertTrue(stringlist.isEmpty());
        assertEquals(0, stringlist.size());

        charlist.addLast('a');
        charlist.addLast('b');
        charlist.addLast('c');
        charlist.clear();
        assertTrue(stringlist.isEmpty());
        assertEquals(0, stringlist.size());
    }
}
