package main.java.interfaces;

public class Video extends Media implements IPlayable {

    private String videoType;

    Video(String author, String date, String message, MessageType messageType, int size, String title, String videoType) {
        super(author, date, message, messageType, size, title);
        this.videoType = videoType;
    }

    public String getVideoType() {
        return videoType;
    }

    @Override
    void showContent() {
        System.out.printf("This is Video:%n");
        super.showContent();
        System.out.printf("Video type: %s%n", getVideoType());
    }

    public void play() {
        System.out.printf("%nVideo playing is started...%n");
        showContent();
        System.out.printf("Video playing has been finished.%n");
    }

}
