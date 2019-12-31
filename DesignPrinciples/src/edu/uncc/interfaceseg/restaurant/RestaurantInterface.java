package edu.uncc.interfaceseg.restaurant;

public interface RestaurantInterface {
    void acceptOnlineOrder();
    void acceptTelephoneOrder();
    void acceptWalkInOrder();
    void payOnline();
    void payInPerson();
}

/**
 * This is the bad design of interface, suppose I have class OnlineClient or WalkInClient which implement this
 * interface, all client's have to implement all methods, which are not useful for the clients.
 *  So this breaks, Single Responsibility, Interface Segregation.
 *
 *  To Apply the interface segregation principle, methods to accept the orders can be placed in Order interface,
 *  method for payments can be placed in Payment Interface.
 *  And each of the client use only required implementation.
 **/