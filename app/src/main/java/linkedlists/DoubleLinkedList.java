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

    }

    public void addFirst(E element) {

    }

    public void addLast(E element) {
        
    }

    public void add(E element, int index) {

    }

    public void getFirst(E element) {

    }

    public void getLast(E element) {

    }

    public void removeFirst() {

    }

    public void remove(E element) {

    }

    public void Sort(Comparator<E> comparator) {
        
    }

    public void size() {

    }

    public void printList() {

    }

    public void clear() {

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

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
