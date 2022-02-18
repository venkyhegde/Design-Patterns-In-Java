package io.github.venkyhegde.iterator.notification;



public class Client {
    public static void main(String[] args) {
        NotificationCollection collection = new NotificationCollection();

        collection.add("Notification 1");
        collection.add("Notification 2");
        collection.add("Notification 3");

        Iterator notificationIter = collection.createIterator();

        while (notificationIter.hasNext()){
            Notification notification = (Notification) notificationIter.next();
            System.out.println(notification.getNotification());
        }
    }
}
