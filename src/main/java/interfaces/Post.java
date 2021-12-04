package main.java.interfaces;

public abstract class Post {

    private String author;
    private String date;
    private String message;
    private MessageType messageType;

    Post(String author, String date, String message, MessageType messageType) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
    }

    abstract int getMaxPostSize();

    void showContent() {
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageType() {
        return messageType.getValue();
    }

}
