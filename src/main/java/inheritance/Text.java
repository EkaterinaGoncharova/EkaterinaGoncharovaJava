package main.java.inheritance;

public class Text extends Post {

    String language;

    Text(String author, String date, String message, String messageType, int size, String language) {
        super(author, date, message, messageType, size);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    void showContent() {
        System.out.printf("%nThis is Text:%n");
        super.showContent();
        System.out.printf("Language: %s%n", getLanguage());
    }

}
