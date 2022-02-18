package io.github.venkyhegde.command;

// This class exposes a method to get the underlying OS and then get the respective file system.
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getFileSystem(){
        String os = System.getProperty("os.name");
        if (os.equalsIgnoreCase("windows")){
            return new WindowsFileSystem();
        } else{
            return new UnixFileSystem();
        }
    }
}
