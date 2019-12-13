package edu.uncc.observer;


public class Client {
    public static void main(String[] args) {
        // create a subject
        MyTopic myTopic  = new MyTopic();

        // create observers
        Observer ob1 = new MySubscriber("Subscriber 1");
        Observer ob2 = new MySubscriber("Subscriber 2");
        Observer ob3 = new MySubscriber("Subscriber 3");
        Observer ob4 = new MySubscriber("Subscriber 4");

        // register this observers to topic. this could have done by passing topic to observer constructor also
        myTopic.register(ob1);
        myTopic.register(ob2);
        myTopic.register(ob3);
        myTopic.register(ob4);

        // attach observer to sub
        // this is not required, rather topics can send state to through update method.
        ob1.setSubject(myTopic);
        ob2.setSubject(myTopic);
        ob3.setSubject(myTopic);
        ob4.setSubject(myTopic);

        // check for update
        ob1.update();

        myTopic.postTopic("New Message");
 

    }
}
