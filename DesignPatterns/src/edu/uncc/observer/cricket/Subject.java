package edu.uncc.observer.cricket;


import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}

class CricketData implements Subject{
   private int run;
    private int wickets;
    private int overs;
    private boolean changeFlag;
    private List<Observer> observers;

    public CricketData(){
        observers = new ArrayList<>();
        changeFlag = false;
    }


    @Override
    public void register(Observer obj) {
        if(obj != null)
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        if(!changeFlag)
            return;
        List<Observer> localObservers = new ArrayList<>(this.observers);
    }
}
