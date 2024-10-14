package linkedlists;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(E element) {
        Node<E> node = new Node<E>(element, null, null);

        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node<E> node = new Node<E>(element, null, temp);
            temp.next = node;
            size++;
        }
    }

    public void add(E element, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        if (isEmpty() || index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> node = new Node<E>(element, temp.next, temp);
            temp.next = node;

            if (node.next != null) {
                node.next.prev = node;
            }
            size++;
        }
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        if (head.next == null) {
            head = null;
        } else {
            Node<E> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    public void remove(E element) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        if (exists(element) == false) {
            throw new NoSuchElementException("Element does not exist");
        }

        if (head.element.equals(element)) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else {
            Node<E> temp = head;

            while (temp.next != null && !temp.next.element.equals(element)) {
                temp = temp.next;
            }
            
            if (temp.next != null && temp.next.element.equals(element)) {
                Node<E> removed = temp.next;
                temp.next = removed.next;

                if (removed.next != null) {
                    removed.next.prev = temp;
                }
            }
        }
        size--;
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    }

    public void Sort(Comparator<E> comparator) {
        // TODO
    }

    public void swap(int index1, int index2) {
        // TODO
    }

    public boolean exists(E element) {
        // TODO
    }

    public int size() {
        return size;
    }

    public String printList() {
        // TODO
    }

    public void clear() {
        // TODO
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
