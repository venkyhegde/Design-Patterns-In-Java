package edu.uncc.mediator;

public abstract class User {
    // user will have a mediator associated
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    abstract void sendMessage(String msg);
    abstract void receiveMessage(String msg);
}

// the concrete user
class UserImpl extends User{

    public UserImpl(ChatMediator mediator, String name){
        super(mediator, name);
    }

    /**
     * This method sends message to mediator.
     * @param msg
     */
    @Override
    void sendMessage(String msg) {
        System.out.println(this.name+" Sending message - "+msg);
        mediator.sendMessage(msg, this); // this is the sending user
    }

    @Override
    void receiveMessage(String msg) {
        System.out.println(this.name+" Received message - "+msg);
    }
}
