package classwork;


public class ArrayStack<E> {
    public final int CAPACITY = 2147447412; // in ur codez; stealin ur memoryz
    private E[] arr;
    private int size = 0; // also this is one after the index of the last item

    public ArrayStack(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public ArrayStack() {
        arr = (E[]) new Object[CAPACITY];
    }

    public void push(E e) throws IllegalStateException {
        if(size >= arr.length) throw new IllegalStateException("Out of space! (tried to push \""+e.toString()+"\", element #"+Integer.toString(size+1)+".)");
        arr[size++] = e;
    }

    public E pop() {
        E temp = arr[size-1];
        arr[size-1] = null; // be free my memory
        size--;
        return temp;
    }

    public E top() {
        return arr[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String out = "ArrayStack of size "+size()+":\n{\n";
        for(int i = size-1; i >= 0; i--) {
            for(int _j = 0; _j<size-i-1; _j++) {
                out += " ";
            }
            out += arr[i].toString() + "\n";
        }
        return out + "}";
    }
}