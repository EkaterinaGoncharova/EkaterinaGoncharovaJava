package main.java.interfaces;

public class Image extends Media implements IPrintable {

    String imageType;

    Image(String author, String date, String message, MessageType messageType, int size, String title, String imageType) {
        super(author, date, message, messageType, size, title);
        this.imageType = imageType;
    }

    public String getImageType() {
        return imageType;
    }

    @Override
    public void showContent() {
        System.out.printf("This is Image:%n");
        super.showContent();
        System.out.printf("Image type: %s%n", getImageType());
    }

    public void print() {
        System.out.printf("%nImage printing is started...%n");
        showContent();
        System.out.printf("Image printing has been finished.%n");
    }

}
