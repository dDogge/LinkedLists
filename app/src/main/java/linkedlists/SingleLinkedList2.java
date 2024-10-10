package linkedlists;

import java.util.Comparator;

public class SingleLinkedList2<E> {
    private Node<E> head;
    private int size;

    public SingleLinkedList2() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
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

    public boolean exists(E element) {
        //TODO
    }

    public void swap(int index1, int index2) {
        //TODO
    }

    public int size() {
        return size;
    }

    public String printList() {
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
