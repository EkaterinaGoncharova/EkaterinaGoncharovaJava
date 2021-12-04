package main.java.inheritance;

public class Video extends Media {

    String videoType;

    Video(String author, String date, String message, String messageType, int size, String title, String videoType) {
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

}
