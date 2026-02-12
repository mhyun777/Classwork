package classwork;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public LinkedList() {}

    public Node<E> getNode(int i) {
        if(i >= size) throw new IndexOutOfBoundsException("Index "+Integer.toString(i)+" out of bounds for list of size "+Integer.toString(size));
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

    public void addEnd(E e) {
        Node<E> newTail = new Node<>(e, tail, null);
        if(size > 0) {
            tail.setNext(newTail);
        } else {
            head = newTail;
        }
        tail = newTail;
        size++;
    }

    public void addFront(E e) {
        Node<E> newHead = new Node<>(e, null, head); // head is null here if size == 0, but that's ok
        if(size > 0) {
            head.setPrevious(newHead);
        } else {
            tail = newHead;
        }
        head = newHead;
        size++;
    }

    public void addAfterNode(Node<E> previousNode, E e) {
        Node<E> toAdd = new Node<>(e, previousNode, null);
        if(previousNode.getNext() != null) {
            toAdd.setNext(previousNode.getNext());
        }
        previousNode.setNext(toAdd);
        size++;
    }

    public void add(E e, int i) {
        if(i==0) {
            addFront(e);
        } else {
            addAfterNode(getNode(i-1), e);
        }
    }

    // public E removeEnd() {
    //     E tailE = tail.getElement();
    //     if(size == 1) {
    //         head = null;
    //         tail = null;
    //     } else {
    //         tail = getNode(size-2);
    //         tail.setNext(null);
    //     }
    //     size--;
    //     return tailE;
    // }

    public E remove(int i) {
        Node<E> toRemove = getNode(i);

        if(size == 1) {
            head = null;
            tail = null;
        } else {
            if(toRemove.getPrevious() != null) {
                toRemove.getPrevious().setNext(toRemove.getNext());
            }
            if(toRemove.getNext() != null) {
                toRemove.getNext().setPrevious(toRemove.getPrevious());
            }
        }
        size--;
        return toRemove.getElement();
    }

    public boolean equals(LinkedList<E> other) {
        Node<E> myNode = head;
        Node<E> theirNode = other.head;
        while(myNode != null && theirNode != null) {
            if(myNode.getElement().equals(theirNode.getElement())) return false;
            myNode = myNode.getNext();
            theirNode = theirNode.getNext();
        }
        return myNode == null && theirNode == null;
    }

    @Override
    public String toString() {
        String output = "[";
        Node<E> node = head;
        while(node.getNext() != null) {
            output += node.getElement().toString() + " -> ";
            node = node.getNext();
        }
        return output + node.getElement().toString() + "]";
    }

    public LinkedList<E> copy() {
        LinkedList<E> newList = new LinkedList<>();
        Node<E> node = head;
        while(node != null) {
            newList.addEnd(node.getElement());
            node = node.getNext();
        }
        return newList;
    }
}
