package io.github.venkyhegde.proxy.imageproxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("my-image.png");

        // displaying through proxy
        image.display();

        // second time
        image.display();

    }
}
