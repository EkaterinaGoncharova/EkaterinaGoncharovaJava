package main.java.interfaces;

public class Audio extends Media implements IPlayable {

    String audioType;

    Audio(String author, String date, String message, MessageType messageType, int size, String title, String audioType) {
        super(author, date, message, messageType, size, title);
        this.audioType = audioType;
    }

    public String getAudioType() {
        return audioType;
    }

    @Override
    void showContent() {
        System.out.printf("%nThis is Audio:%n");
        super.showContent();
        System.out.printf("Audio type: %s%n", getAudioType());
    }

    public void play() {
        System.out.printf("%nAudio playing is started...%n");
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
        System.out.printf("Size: %s%n", getSize());
        System.out.printf("Title: %s%n", getTitle());
        System.out.printf("Audio type: %s%n", getAudioType());
        System.out.printf("Audio playing has been finished.%n");
    }

}
