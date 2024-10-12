package linkedlists;

import java.util.Comparator;
import java.util.NoSuchElementException;

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
        Node<E> node = new Node<E>(element, null);

        if (isEmpty()) {
            head = node;
            head.next = head;
        } else {
            Node<E> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            node.next = head;
            head = node;
            temp.next = head;
        }
        size++;
    }

    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            Node<E> node = new Node<E>(element, head);
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
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            Node<E> node = new Node<E>(element, temp.next);
            temp.next = node;
            size++;
        }
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        Node<E> temp = head;
        while (temp.next != head) {
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
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head; 
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
            if (head.next == head) {
                head = null;  
            } else {
                Node<E> temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
    
                temp.next = head.next;
                head = head.next;  
            }
        } else {
            Node<E> temp = head;

            while (temp.next != null && !temp.next.element.equals(element)) {
                temp = temp.next;
            }
            if (temp.next.element.equals(element)) {
                temp.next = temp.next.next;
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

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            
            temp.next = temp.next.next;
        }
        size--;
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

        if (index1 >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index1);
        }

        if (index2 >= size) {
            throw new IllegalArgumentException("Index out of bounds: " + index2);
        }

        if (index1 == index2) {
            throw new IllegalArgumentException("Element cant swap position with itself");
        }

        Node<E> temp1 = head;
        Node<E> temp2 = head;

        for (int i = 0; i < index1; i++) {
            temp1 = temp1.next;
        }

        for (int i = 0; i < index2; i++) {
            temp2 = temp2.next;
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
            while (temp.next != head) {
                if (temp.next.equals(element)) {
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
        sb.append(temp.element).append(" ");
        temp = head.next;

        while (temp != head) {
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

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}
