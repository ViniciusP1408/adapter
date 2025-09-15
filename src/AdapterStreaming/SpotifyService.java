package AdapterStreaming;

public class SpotifyService {
    public void startSong(String musica) {
        System.out.println("[Spotify] Tocando: " + musica);
    }

    public void endSong() {
        System.out.println("[Spotify] Parou");
    }
}
