package linkedlists;

import java.util.Comparator;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        //TODO
    }

    public void addFirst(E element) {
        //TODO
    }

    public void addLast(E element) {
        //TODO
    }

    public void add(E element, int index) {
        //TODO
    }

    public E getFirst() {
        //TODO
    }

    public E getLast() {
        //TODO
    }

    public E get(int index) {
        //TODO            
    }

    public void removeFirst() {
        //TODO
    }

    public void removeLast() {
        //TODO
    }

    public void remove(E element) {
        //TODO
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
        //TODO
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
        private Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
