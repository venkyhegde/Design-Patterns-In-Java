package edu.uncc.command.find;

//The client which invokes the find command
public class Client {
    public static void main(String[] args) {
        Command findCommand = new FindCommand("test-file.txt");
        findCommand.execute();
    }
}
