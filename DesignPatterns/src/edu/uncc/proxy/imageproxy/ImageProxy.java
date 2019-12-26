package edu.uncc.proxy.imageproxy;

public class ImageProxy implements Image {
    private ImageImpl realImage;
    private String name;

    public ImageProxy(String name) {
        this.name = name;
    }


    @Override
    public void display() {
        if (realImage == null || !realImage.getImageName().equals(this.name)) {
            realImage = new ImageImpl(this.name);
        }
        realImage.display();
    }
}
