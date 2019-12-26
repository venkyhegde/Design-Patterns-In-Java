package edu.uncc.dependencyinjection;

import java.util.concurrent.TimeUnit;

public interface Service {
    void writeMessage(String message) throws InterruptedException;
}

class ServiceImp implements Service{

    @Override
    public void writeMessage(String message) throws InterruptedException {
        System.out.println("Writing the message...");
        for (char c: message.toCharArray()){
            System.out.print(c);
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println();
    }
}
