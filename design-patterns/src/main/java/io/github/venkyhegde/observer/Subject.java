package io.github.venkyhegde.observer;

import java.util.ArrayList;
import java.util.List;

// this is the subject
public interface Subject {
    // subject have method to attach and detach observers
    void register(Observer obj);
    void unregister(Observer obj);

    // subject send notification / updates to observers also observers can request for updates
    void notifyObservers();
    Object getUpdate(Observer obj); // this method returns an updated object to observer upon request.

}

class MyTopic implements Subject{

    // topic would have list of Observers subscribed to this topic
    // actual content i.e string message.
    // flag to see if there any change.
    private List<Observer> observers;
    private String message;
    private boolean changeFlag;

    public MyTopic(){
        observers = new ArrayList<>();
    }

    // method to add new observer
    @Override
    public void register(Observer obj) {
        if(obj != null)
            observers.add(obj);
    }

    // remove observer
    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    // this method post notifications to all Observers if there anything changes.
    @Override
    public void notifyObservers() {
        // if nothing changed then return
        if (!changeFlag)
            return;

        List<Observer> localObservers = new ArrayList<>(this.observers);
        for (Observer obj: localObservers){
            obj.update();
        }
        changeFlag = false;

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // this method is used by the clients to post new topics
    // so this will update the content and notify all observers
    public void postTopic(String message){
        this.message = message;
        this.changeFlag = true;
        System.out.println("Message posted to topic is - "+message);
        notifyObservers();
    }
}
