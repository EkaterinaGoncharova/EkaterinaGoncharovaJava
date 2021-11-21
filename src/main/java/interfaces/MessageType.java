package main.java.interfaces;

public enum MessageType {
    POST("Post"),
    REPOST("Repost"),
    COMMENT("Comment");

    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    String getValue() {
        return this.value;
    }

}
