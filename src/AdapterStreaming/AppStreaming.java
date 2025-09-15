package AdapterStreaming;

public class AppStreaming {
    public static void main(String[] args) {
        Player spotify = new SpotifyPlayerAdapter(new SpotifyService());
        Player youtube = new YouTubePlayerAdapter(new YouTubeService());

        spotify.play("Imagine - John Lennon");
        spotify.stop();

        youtube.play("Palestra de Design Patterns");
        youtube.stop();
    }
}
