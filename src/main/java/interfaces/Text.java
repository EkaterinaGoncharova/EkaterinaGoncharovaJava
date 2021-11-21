package main.java.interfaces;

public class Text extends Post implements IPrintable {

    String language;

    Text(String author, String date, String message, MessageType messageType, int size, String language) {
        super(author, date, message, messageType, size);
        this.language = language;
    }

    String getLanguage() {
        return language;
    }

    @Override
    void showContent() {
        System.out.printf("%nThis is Text:%n");
        super.showContent();
        System.out.printf("Language: %s%n", getLanguage());
    }

    public void print() {
        System.out.printf("%nText printing is started...%n");
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
        System.out.printf("Size: %s%n", getSize());
        System.out.printf("Language: %s%n", getLanguage());
        System.out.printf("Text printing has been finished.%n");
    }

}
