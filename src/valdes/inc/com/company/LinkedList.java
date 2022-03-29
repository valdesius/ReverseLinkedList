package valdes.inc.com.company;

public class LinkedList<T> {
    private class Node {
        public T value;
        public Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this(value, null);
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public int size() {
        return size;
    }


    public void addFirst(T value) {
        head = new Node(value, head);

        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(T value) {
        if (size == 0) {
            head = tail = new Node(value);
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }

        size++;
    }

    private Node getNode(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public Node recursiveReverse(Node prev, Node curr) {
        Node next = curr.next;
        curr.next = prev;
        return (next == null) ? curr : recursiveReverse(curr, next);
    }

    public void reverse() {
        if (head != null)
            head = recursiveReverse(null, head);
    }


    public T get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node current = head;

        if (current == null || current.next == null) {
            throw new NullPointerException();
        }

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        } else
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

        if (current != null) {
            current.next = current.next.next;
        }

        size--;
    }

}
