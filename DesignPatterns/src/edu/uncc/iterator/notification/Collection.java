package edu.uncc.iterator.notification;


// this is an aggregator
public interface Collection {
    Iterator createIterator();
}

class NotificationCollection implements Collection{
    static final int MAX_ITEMS = 10;
    int numOfItems;
    Notification[] notifications;

    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];
        numOfItems = 0;
    }

    public void add(String notification){
        if (numOfItems < MAX_ITEMS){
            Notification n = new Notification(notification);
            notifications[numOfItems++] = n;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}