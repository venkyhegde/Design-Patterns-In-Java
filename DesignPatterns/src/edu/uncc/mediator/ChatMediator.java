package edu.uncc.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the mediator interface for the chat application.
 * This mediator describes two methods
 * 1. to send message to all users
 * 2. add user to the group
 */

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
// concrete mediator
class ChatMediatorImpl implements ChatMediator{
    // this mediator have list of users of this chat
    List<User> userList;
    public ChatMediatorImpl(){
        userList = new ArrayList<>();
    }

    /**
     * Sends message to all user except this user
     * @param msg
     * @param user
     */
    @Override
    public void sendMessage(String msg, User user){
        for(User u: userList){
            if(u != user){
                u.receiveMessage(msg); // other users receive message.
            }
        }
    }

    /**
     * Method to add user to this chat group
     * @param user
     */
    @Override
    public void addUser(User user){
        userList.add(user);
    }
}
