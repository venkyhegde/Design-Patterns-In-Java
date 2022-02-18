package io.github.venkyhegde.command;

// this is the command interface
public interface Command {
    void execute();

    // redo/undo could be added here.
}

class OpenFileCommand implements Command{

    private FileSystemReceiver fs;

    // here use String/Object store the state for undo and redo

    public OpenFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.openFile();
    }

    // have method here
    //public void undo(){
        // restore previous state
        // memberVariable = prevMemberVariable

   // }
}

class WriteFileCommand implements Command{

    private FileSystemReceiver fs;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.writeFile();
    }
}

class CloseFileCommand implements Command{

    private FileSystemReceiver fs;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.closeFile();
    }
}