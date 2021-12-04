package main.java.inheritance;

public class Image extends Media {

    String imageType;

    Image(String author, String date, String message, String messageType, int size, String title, String imageType) {
        super(author, date, message, messageType, size, title);
        this.imageType = imageType;
    }

    public String getImageType() {
        return imageType;
    }

    @Override
    void showContent() {
        System.out.printf("%nThis is Image:%n");
        super.showContent();
        System.out.printf("Image type: %s%n", getImageType());
    }

}
