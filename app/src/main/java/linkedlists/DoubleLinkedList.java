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

        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<E> temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    } 

    public void Sort(Comparator<E> comparator) {
        int n = size;

        for (int i = 0; i < (n - 1); i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(get(j), get(min)) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                swap(i, min);
            }
        }
    }

    public void swap(int index1, int index2) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    
        if (index1 < 0 || index1 >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index1);
        }
    
        if (index2 < 0 || index2 >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index2);
        }

        if (index1 == index2) {
            throw new IllegalArgumentException("Element cant swap position with itself");
        }

        Node<E> temp1 = head;
        Node<E> temp2 = head;

        for (int i = 0; i < Math.max(index1, index2); i++) {
            if (i < index1) {
                temp1 = temp1.next;
            }
            if (i < index2) {
                temp2 = temp2.next;
            }
        }

        E tempElement = temp1.element;
        temp1.element = temp2.element;
        temp2.element = tempElement;
    }

    public boolean exists(E element) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        Node<E> temp = head;

        if (head.element.equals(element)) {
            return true;
        } else {
            while (temp.next != null) {
                if (temp.next.element.equals(element)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public String printList() {
        if (isEmpty()) {
            return "List is empty";
        }

        StringBuilder sb = new StringBuilder();
        Node<E> temp = head;

        while (temp != null) {
            sb.append(temp.element).append(" ");
            temp = temp.next;
        }
        return sb.toString();

    }

    public void clear() {
        head = null;
        size = 0;
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
