package linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

public class SingleLinkedList1Test {
    private SingleLinkedList1<Integer> intlist;
    private SingleLinkedList1<String> stringlist;
    private SingleLinkedList1<Character> charlist;

    @BeforeEach
    public void setUp() {
        intlist = new SingleLinkedList1<>();
        stringlist = new SingleLinkedList1<>();
        charlist = new SingleLinkedList1<>();
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

}
