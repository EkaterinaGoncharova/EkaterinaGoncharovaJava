package main.java.inheritance;

public class Media extends Post {

    String title;

    Media(String author, String date, String message, String messageType, int size, String title) {
        super(author, date, message, messageType, size);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.printf("Title: %s%n", getTitle());
    }

}
