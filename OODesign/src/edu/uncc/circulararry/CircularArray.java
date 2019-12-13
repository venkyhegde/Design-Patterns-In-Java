package edu.uncc.circulararry;

import java.util.Iterator;

/**
 * Designing the Circular Array
 * @param <T>
 */

// an array to store the elements & head points start of the array
public class CircularArray<T> implements Iterable<T> {
    private T[] items;
    private int head;
    public int length;

    public CircularArray(int size){
        items = (T[]) new Object[size];
        head = 0;
        length = size;
    }

    // method to find the index
    private int getIndex(int i){
        return (i+head) % length;
    }

    // methods to set an element to index, get an element and rotate the array by num
    public void set(int index, T e){
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException("Invalid index - "+index);
        }
        items[getIndex(index)] = e;
    }

    public T get(int index){
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException("Invalid index - "+index);
        }
        return items[getIndex(index)];
    }

    public void rotate(int rightShift){
        head = getIndex(rightShift);
    }

    // to implement the iterator CircularArray has to implement Iterable interface and override iterator method to
    // return iterator.

    // An iterator class should be created by implementing Iterator interface and overriding hasNext, next and remove
    // methods

    @Override
    public Iterator<T> iterator(){
        return new CircularArrayIterator<T>(this);
    }

    private class CircularArrayIterator<T> implements Iterator<T> {

        private int cur = -1;
        private T[] iteItems;

        CircularArrayIterator(CircularArray<T> array){
            iteItems = array.items;
        }

        @Override
        public boolean hasNext(){
            return cur < length-1;
        }

        @Override
        public T next(){
            cur++;
            return iteItems[getIndex(cur)];
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
}
