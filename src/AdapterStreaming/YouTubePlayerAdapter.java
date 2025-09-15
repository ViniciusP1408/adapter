package AdapterStreaming;

public class YouTubePlayerAdapter implements Player {
    private final YouTubeService youtube;

    public YouTubePlayerAdapter(YouTubeService youtube) {
        this.youtube = youtube;
    }

    @Override
    public void play(String midia) {
        youtube.iniciarVideo(midia);
    }

    @Override
    public void stop() {
        youtube.pausarVideo();
    }
}
