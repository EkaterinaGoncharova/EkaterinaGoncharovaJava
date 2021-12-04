package main.java.inheritance;

public abstract class Post {

    private String author;
    private String date;
    private String message;
    private String messageType;

    Post(String author, String date, String message, String messageType) {
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
        return messageType;
    }

}
