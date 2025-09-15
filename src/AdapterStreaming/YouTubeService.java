package AdapterStreaming;

public class YouTubeService {
    public void iniciarVideo(String video) {
        System.out.println("[YouTube] Reproduzindo: " + video);
    }

    public void pausarVideo() {
        System.out.println("[YouTube] Pausado");
    }
}
