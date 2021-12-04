package main.java.interfaces;

public class InterfacesMain {

    public static void main(String[] args) {
        final Text text = new Text("Katya", "2021-10-20", "Text message", MessageType.POST,"English");
        final Image image = new Image("Anya", "2021-11-10", "Image message", MessageType.REPOST, 8, "Image title", "JPG");
        final Audio audio = new Audio("Lev", "2021-10-16", "Audio message", MessageType.COMMENT, 20, "Audio title", "MP3");
        final Video video = new Video("Kira", "2021-10-24", "Video message", MessageType.POST, 14, "Video title", "MP4");

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
