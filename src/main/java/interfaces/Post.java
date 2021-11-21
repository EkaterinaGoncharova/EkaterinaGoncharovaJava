package main.java.interfaces;

public abstract class Post {

    private String author;
    private String date;
    private String message;
    private MessageType messageType;
    private int size;

    Post(String author, String date, String message, MessageType messageType, int size) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
        this.size = size;
    }

    static int getMaxPostSize(Post[] posts) {
        int max = 0;
        for (Post post : posts) {
            int size = post.getSize();
            if (size > max) {
                max = size;
            }
        }
        return max;
    }

    void showContent() {
        System.out.printf("Author: %s%n", getAuthor());
        System.out.printf("Date: %s%n", getDate());
        System.out.printf("Message: %s%n", getMessage());
        System.out.printf("Message type: %s%n", getMessageType());
        System.out.printf("Size: %d%n", getSize());
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

    public int getSize() {
        return size;
    }
}
