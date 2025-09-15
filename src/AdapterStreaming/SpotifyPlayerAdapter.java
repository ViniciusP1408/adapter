package AdapterStreaming;

public class SpotifyPlayerAdapter implements Player {
    private final SpotifyService spotify;

    public SpotifyPlayerAdapter(SpotifyService spotify) {
        this.spotify = spotify;
    }

    @Override
    public void play(String midia) {
        spotify.startSong(midia);
    }

    @Override
    public void stop() {
        spotify.endSong();
    }
}
