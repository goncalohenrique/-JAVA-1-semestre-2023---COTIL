public class Musica {

    private int cod;
    private  String nome;
    private double duracao;
    private String album;
    private String artista;

    public Musica(int cod, String nome, double duracao, String album, String artista) {
        this.cod = cod;
        this.nome = nome;
        this.duracao = duracao;
        this.album = album;
        this.artista = artista;
    }

    public String mostra()
    {
      return album;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
