package edu.uncc.command;

// this is the client which will associate object and invoke the command
public class Client {
    public static void main(String[] args) {
        // Creating the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getFileSystem();

        // Create the command
        Command commandOpenFile = new OpenFileCommand(fs);

        // now, create the invoker to invoke command by passing the command object
        FileInvoker invoker = new FileInvoker(commandOpenFile);

        // execute the command
        invoker.execute();


        // Close command
        Command closeCommand = new CloseFileCommand(fs);
        invoker = new FileInvoker(closeCommand);
        invoker.execute();
    }
}
