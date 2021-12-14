package main.java.interfaces;

public class Text extends Post implements IPrintable {

    private String language;

    Text(String author, String date, String message, MessageType messageType, String language) {
        super(author, date, message, messageType);
        this.language = language;
    }

    String getLanguage() {
        return language;
    }

    @Override
    int getMaxPostSize() {
        return 0;
    }

    @Override
    void showContent() {
        System.out.printf("This is Text:%n");
        super.showContent();
        System.out.printf("Language: %s%n", getLanguage());
    }

    public void print() {
        System.out.printf("%nText printing is started...%n");
        showContent();
        System.out.printf("Text printing has been finished.%n");
    }

}
