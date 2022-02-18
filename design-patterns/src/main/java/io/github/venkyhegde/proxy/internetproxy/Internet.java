package io.github.venkyhegde.proxy.internetproxy;

// the subject
public interface Internet {
    void connect(String url) throws Exception;
}

class InternetImpl implements Internet{

    @Override
    public void connect(String url) throws Exception {
        // logic to connect to internet
        System.out.println("Connected to "+url);
    }
}