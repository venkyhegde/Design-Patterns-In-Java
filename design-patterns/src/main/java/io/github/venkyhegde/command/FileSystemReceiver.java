package io.github.venkyhegde.command;

// this is the receiver interface
public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();

}

class WindowsFileSystem implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows");
    }
}

class UnixFileSystem implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix");
    }
}
