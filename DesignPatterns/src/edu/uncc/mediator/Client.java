package edu.uncc.mediator;

public class Client {
    public static void main(String[] args) {
        // here create a new mediator and add user to the mediator.
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "User 1");
        User user2 = new UserImpl(mediator, "User 2");
        User user3 = new UserImpl(mediator, "User 3");
        User user4 = new UserImpl(mediator, "User 4");
        User user5 = new UserImpl(mediator, "User 5");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.sendMessage("Welcome to the chat group");
        user2.sendMessage("Thank you, Hi all :)");

    }
}
