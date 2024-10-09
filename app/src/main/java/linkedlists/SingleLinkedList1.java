package linkedlists;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class SingleLinkedList1<E> {
    private Node<E> head;
    private int size;

    public SingleLinkedList1() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            Node<E> node = new Node<E>(element, null);
            head = node;
            size++;
        } else {
            Node<E> node = new Node<E>(element, head);
            head = node;
            size++;
        }
    }

    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<E>(element, null);
            size++;
        }
    }

    public void add(E element, int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        if (isEmpty() || (index == 0)) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> newNode = new Node<>(element, temp.next);
            temp.next = newNode;
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

        head = head.next;
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
            head = head.next; 
        } else {
            Node<E> temp = head; 

            while (temp.next != null && !temp.next.element.equals(element)) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next; 
            }
        }
        size--;
    }

    public void removeAt(int index) {
        //TODO
    }

    public void Sort(Comparator<E> comparator) {
        //TODO
    }

    public void swap(int index1, int index2) {
        //TODO
    }

    public boolean exists(E element) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        Node<E> temp = head;

        while (temp != null) {
            if (temp.element.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
       return size; 
    }

    public void printList() {
        //TODO
    }

    public void clear() {
        //TODO
    }
    
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}
