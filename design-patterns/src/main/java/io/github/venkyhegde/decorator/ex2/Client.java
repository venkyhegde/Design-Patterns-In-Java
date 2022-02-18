package io.github.venkyhegde.decorator.ex2;

import java.io.*;

public class Client {
    public static void main(String[] args) {

        int ch = 0;

        InputStream inputStream = null;

        byte[] bytes = "HEllo World".getBytes();

        try{
            // get files and ip stream
            inputStream = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((ch = inputStream.read()) >= 0){
                System.out.print((char) ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
