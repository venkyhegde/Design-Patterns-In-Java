package io.github.venkyhegde.proxy.imageproxy;

// this is the subject
public interface Image {
    void display();
}

// this is the real subject
class ImageImpl implements Image{
    private String imageName;

    public ImageImpl(String imageName) {
        this.imageName = imageName;
        loadImage(this.imageName);
    }


    @Override
    public void display() {
        System.out.println("Displaying image "+this.imageName);
    }

    private void loadImage(String imageName){
        System.out.println("Loading the image ...");
    }

    public String getImageName() {
        return imageName;
    }
}
