package io.github.venkyhegde.proxy.internetproxy;

import java.util.HashSet;
import java.util.Set;

public class InternetProxy implements Internet {
    private InternetImpl internet;

    public InternetProxy() {
        this.internet = new InternetImpl();
    }

    private static Set<String> restrictedSites;

    static {
        restrictedSites = new HashSet<>();
        restrictedSites.add("https://bannedsite.com");
        restrictedSites.add("https://threat.com");
    }


    @Override
    public void connect(String url) throws Exception {
        if (url != null && restrictedSites.contains(url.toLowerCase())){
            throw new Exception("Access Denied to "+url);
        }
        internet.connect(url);
    }
}
