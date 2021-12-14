package main.java.inheritance;

public abstract class Media extends Post {

    private String title;
    private int maxSize;

    Media(String author, String date, String message, String messageType, int maxSize, String title) {
        super(author, date, message, messageType);
        this.title = title;
        this.maxSize = maxSize;
    }

    public String getTitle() {
        return title;
    }

    @Override
    int getMaxPostSize() {
        return maxSize;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.printf("Title: %s%n", getTitle());
    }

}
