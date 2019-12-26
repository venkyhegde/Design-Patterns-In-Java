package edu.uncc.iterator.university;

import java.util.List;

public interface Iterator {
    void first(); // sets cursor to first item
    String next();
    boolean isDone();
    String currentItem(); // returns current item
}

class ArtsIterator implements Iterator{
        private String[] subjects;
        private int pos;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        pos = 0;
    }

    @Override
    public void first() {
        pos = 0;
    }

    @Override
    public String next() {
        if (!isDone()){
            return subjects[pos++];
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return pos >= subjects.length;
    }

    @Override
    public String currentItem() {
        if (!isDone()){
            return subjects[pos];
        }
        return null;
    }
}

class ScienceIterator implements Iterator{

    private List<String> subjects;
    private int pos;

    public ScienceIterator(List<String> subjects) {
        this.subjects = subjects;
        pos = 0;
    }

    @Override
    public void first() {
        pos = 0;
    }

    @Override
    public String next() {
        if (!isDone()){
            return subjects.get(pos++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return pos >= subjects.size();
    }

    @Override
    public String currentItem() {
        if (!isDone()){
            return subjects.get(pos);
        }
        return null;
    }
}