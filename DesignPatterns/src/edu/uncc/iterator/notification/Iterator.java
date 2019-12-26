package edu.uncc.iterator.notification;

public interface Iterator {
    boolean hasNext();
    Object next();
}

class NotificationIterator implements Iterator{
    private Notification[] notifications;
    private int position;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        if(position >= notifications.length || notifications[position] == null)
            return false;

        return true;
    }

    @Override
    public Notification next() {
        if (hasNext()) {
            return notifications[position++];
        }
        return null;
    }
}