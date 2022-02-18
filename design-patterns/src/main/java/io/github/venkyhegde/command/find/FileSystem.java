package io.github.venkyhegde.command.find;

import java.util.ArrayList;
import java.util.List;

// this is the receiver
public interface FileSystem {
    void find(String path);
}

class LinuxFileSystem implements FileSystem{
     private LinuxFileSystem() {

    }

    @Override
    public void find(String path) {
        System.out.println("Finding the file - "+path);
        // considering root path as starting node
        // do the DFS or BFS from starting node,
        // return the file node when found.
        System.out.println("File found returning.....");
    }

    // file and directory structure as n-ary tree
    private static class FileSysNode{
        String name;
        int size;
        boolean isDir;
        List<FileSysNode> children;

        public FileSysNode() {
        }

        public FileSysNode(String name, boolean isDir) {
            this.name = name;
            this.isDir = isDir;
            children = new ArrayList<>();
            size = 0;
        }

    }

    // this helper class to return single object of fs.
    private static class Helper{
         private static final FileSystem fs = new LinuxFileSystem();
    }
    public static FileSystem getFS(){
         return Helper.fs;
    }
}

