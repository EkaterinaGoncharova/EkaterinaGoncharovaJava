package main.java.inheritance;

public class Audio extends Media {

    private String audioType;

    Audio(String author, String date, String message, String messageType, int size, String title, String audioType) {
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

}
