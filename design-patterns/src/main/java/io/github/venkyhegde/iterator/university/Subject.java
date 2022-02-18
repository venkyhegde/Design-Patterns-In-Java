package io.github.venkyhegde.iterator.university;

import java.util.LinkedList;
import java.util.List;

// aggregator
public interface Subject {
    Iterator createIterator();
}

class ArtsSubject implements Subject{
    private String[] subjects;

    public ArtsSubject() {
        subjects = new String[4];
        subjects[0] = "French";
        subjects[1] = "English";
        subjects[2] = "Hindi";
        subjects[3] = "Kannada";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}

class ScienceSubject implements Subject{
    private List<String> subjects;

    public ScienceSubject() {
        subjects = new LinkedList<>();
        subjects.add("Physics");
        subjects.add("Computer Science");
        subjects.add("Chemistry");
        subjects.add("Maths");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}