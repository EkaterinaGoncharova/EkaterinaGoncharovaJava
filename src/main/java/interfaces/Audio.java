package main.java.interfaces;

public class Audio extends Media implements IPlayable {

    private String audioType;

    Audio(String author, String date, String message, MessageType messageType, int size, String title, String audioType) {
        super(author, date, message, messageType, size, title);
        this.audioType = audioType;
    }

    public String getAudioType() {
        return audioType;
    }

    @Override
    void showContent() {
        System.out.printf("This is Audio:%n");
        super.showContent();
        System.out.printf("Audio type: %s%n", getAudioType());
    }

    public void play() {
        System.out.printf("%nAudio playing is started...%n");
        showContent();
        System.out.printf("Audio playing has been finished.%n");
    }

}
