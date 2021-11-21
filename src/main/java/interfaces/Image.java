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
        System.out.printf("%nThis is Image:%n");
        super.showContent();
        System.out.printf("Image type: %s%n", getImageType());
    }

    public void print() {
        System.out.printf("%nImage printing is started...%n");
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
        System.out.printf("Size: %s%n", getSize());
        System.out.printf("Title: %s%n", getTitle());
        System.out.printf("Image type: %s%n", getImageType());
        System.out.printf("Image printing has been finished.%n");
    }

}
