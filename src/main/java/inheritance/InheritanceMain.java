package main.java.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        final Text text = new Text("Katya", "2021-10-20", "Text message", "Post", 3, "English");
        final Image image = new Image("Anya", "2021-11-10", "Image message", "Repost", 8, "Image title", "JPG");
        final Audio audio = new Audio("Lev", "2021-10-16", "Audio message", "Comment", 20, "Audio title", "MP3");
        final Video video = new Video("Kira", "2021-10-24", "Video message", "Post", 14, "Video title", "MP4");
        final Post[] posts = {text, image, audio, video};
        for (Post post : posts) {
            post.showContent();
        }
        int maxSize = Post.getMaxPostSize(posts);
        System.out.printf("%nMax content size: %s", maxSize);
    }
}
