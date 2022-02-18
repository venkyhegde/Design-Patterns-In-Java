package io.github.venkyhegde.observer;

public interface Observer {
    // Observer have method to update observer which is  used by subject
    void update();

    // attach with subject to observe, this method is not required
    // but helpful to query the subject to see if there any update.
    void setSubject(Subject sub);
}

class MySubscriber implements Observer{

    // subject to which this Subscriber subscribed to.
    // this subject not really required here, but this can be used to get updates from subject
    private Subject topic;
    private String name; // name of this subscriber

    public MySubscriber(String name) {
        this.name = name;
    }

    // this method asks for the update from subject
    // Here, don't have to invoke getUpdate of topic, rather Topic can just pass the updated state as parameter to
    // this method.
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null){
            System.out.println(name+ " there is no update on the topic");
        }else {
            System.out.println(name+" Consuming message"+msg);
        }

    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
