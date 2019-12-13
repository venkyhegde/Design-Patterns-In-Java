package edu.uncc.command;

// this is just a plain java class which encapsulates the Command object
public class FileInvoker {

    public Command command;

    public FileInvoker(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }

}
