package edu.uncc.proxy.internetproxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        try{
            internet.connect("https://google.com");
            internet.connect("https://bannedsite.com");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
