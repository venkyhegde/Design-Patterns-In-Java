package edu.uncc.command.find;

// this is the command
public interface Command {
    void execute();
}

class FindCommand implements Command{

    private String path;
    private FileSystem fs;
    public FindCommand(String path) {
        this.path = path;
        fs = LinuxFileSystem.getFS();
    }

    @Override
    public void execute() {
        fs.find(path);
    }
}


