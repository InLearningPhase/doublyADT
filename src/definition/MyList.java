package definition;

import adt.doublyADT;

public class MyList<E> implements doublyADT<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(Object item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        Node<E> temp = head;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            sb.append(data);
            sb.append((i < size -1) ? ", " : "");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E> {

        private E data;
        private Node previous;
        private Node next;
        private Node(Node<E> previous, E data, Node<E> next){
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node getPrevious() {
            return previous;
        }

        public Node getNext() {
            return next;
        }
    }
}
