package edu.uncc.dip;

// here, PasswordReminder is depend on the interface rather on concrete implementation.
// this looks much similar to programming to an interface, but it's even strictly abstraction based.
public class PasswordReminder {
    private DBConnection connection;

    public PasswordReminder(DBConnection connection) {
        this.connection = connection;
    }
}
