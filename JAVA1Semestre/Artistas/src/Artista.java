public class Artista {

    private int cod;
    private  String nome;
    private String naci;

    public Artista(int cod, String nome, String naci) {
        this.cod = cod;
        this.nome = nome;
        this.naci = naci;
    }

    public String mostra()
    {
        return nome;
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

    public String getNaci() {
        return naci;
    }

    public void setNaci(String naci) {
        this.naci = naci;
    }
}
