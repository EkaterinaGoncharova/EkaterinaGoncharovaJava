package main.java.interfaces;

public class Video extends Media implements IPlayable {

    String videoType;

    Video(String author, String date, String message, MessageType messageType, int size, String title, String videoType) {
        super(author, date, message, messageType, size, title);
        this.videoType = videoType;
    }

    public String getVideoType() {
        return videoType;
    }

    @Override
    void showContent() {
        System.out.printf("%nThis is Video:%n");
        super.showContent();
        System.out.printf("Video type: %s%n", getVideoType());
    }

    public void play() {
        System.out.printf("%nVideo playing is started...%n");
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
        System.out.printf("Size: %s%n", getSize());
        System.out.printf("Title: %s%n", getTitle());
        System.out.printf("Audio type: %s%n", getVideoType());
        System.out.printf("Video playing has been finished.%n");
    }

}
