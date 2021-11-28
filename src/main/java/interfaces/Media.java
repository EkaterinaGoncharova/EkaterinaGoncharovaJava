package main.java.interfaces;

public class Media extends Post {

    String title;
    int maxSize;

    Media(String author, String date, String message, MessageType messageType, int maxSize, String title) {
        super(author, date, message, messageType);
        this.title = title;
        this.maxSize = maxSize;
    }

    public String getTitle() {
        return title;
    }

    @Override
    int getMaxPostSize() {
        return maxSize;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.printf("Title: %s%n", getTitle());
    }

}
