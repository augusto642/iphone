import java.util.List;

public class ReprodutorMusical {
    private List<Musica> playlist;

    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public List<Musica> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Musica> playlist) {
        this.playlist = playlist;
    }
}
