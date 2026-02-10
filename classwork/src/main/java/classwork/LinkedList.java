package classwork;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public LinkedList() {}

    public Node<E> getNode(int i) {
        if(i >= size) throw new IndexOutOfBoundsException();
        Node<E> node = head;
        for(; i>0; i--) {
            node = node.getNext();
        }
        return node;
    }

    public E get(int i) {
        return getNode(i).getElement();
    }

    public void set(int i, E e) {
        getNode(i).setElement(e);
    }

    public void push(E e) {
        Node<E> newTail = new Node<>(e);
        if(size > 0) {
            tail.setNext(newTail);
        } else {
            head = newTail;
        }
        tail = newTail;
        size++;
    }

    public E pop() {
        E tailE = tail.getElement();
        if(size == 1) {
            head = null;
            tail = null;
        } else {
            tail = getNode(size-2);
            tail.setNext(null);
        }
        size--;
        return tailE;
    }

    public void add(int i, E e) {
        Node<E> toAdd = new Node<>(e);
        if(i != size) {
            toAdd.setNext(getNode(i));
            if(i == 0) {
                head = toAdd;
            } else {
                getNode(i-1).setNext(toAdd);
            }
        } else {
            if(size != 0) {
                tail.setNext(toAdd);
            }
            tail = toAdd;
        }
        size++;
    }

    public E remove(int i) {
        Node<E> toRemove = getNode(i);
        getNode(i-1).setNext(getNode(i+1));
        size--;
        return toRemove.getElement();
    }

    @Override
    public String toString() {
        String output = "[";
        Node<E> node = head;
        while(node.getNext() != null) {
            output += node.getElement().toString() + ", ";
            node = node.getNext();
        }
        return output + node.getElement().toString() + "]";
    }
}
