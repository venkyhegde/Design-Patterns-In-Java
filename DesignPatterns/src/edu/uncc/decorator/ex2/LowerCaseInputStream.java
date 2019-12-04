package edu.uncc.decorator.ex2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// this is a decorator, to add additional func to read methods of FilterInPut stream
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException{
        // converts to lower case
        int c = in.read();
        c = c == -1 ? c : Character.toLowerCase(c);
        return c;
     }

     @Override
     public int read(byte[] bytes, int offset, int len) throws IOException{
        int res = in.read(bytes, offset, len);

        for (int i=0; i< offset+res; i++){
            bytes[i] = (byte) Character.toLowerCase((char)bytes[i]);
        }
        return res;
     }
}
