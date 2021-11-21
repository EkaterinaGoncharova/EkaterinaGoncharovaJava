package main.java.interfaces;

public class InterfacesMain {

    public static void main(String[] args) {
        final Text text = new Text("Katya", "2021-10-20", "Text message", MessageType.POST, 3, "English");
        final Image image = new Image("Anya", "2021-11-10", "Image message", MessageType.REPOST, 8, "Image title", "JPG");
        final Audio audio = new Audio("Lev", "2021-10-16", "Audio message", MessageType.COMMENT, 20, "Audio title", "MP3");
        final Video video = new Video("Kira", "2021-10-24", "Video message", MessageType.POST, 14, "Video title", "MP4");

        final Post[] posts = {text, image, audio, video};
        int maxSize = Post.getMaxPostSize(posts);
        System.out.printf("%nMax content size: %s%n", maxSize);

        final IPrintable[] printableDocs = {text, image};
        for (IPrintable doc : printableDocs) {
            doc.print();
        }

        final IPlayable[] playableDocs = {audio, video};
        for (IPlayable doc : playableDocs) {
            doc.play();
        }
    }

}
