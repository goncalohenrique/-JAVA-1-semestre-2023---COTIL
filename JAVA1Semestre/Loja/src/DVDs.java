public class DVDs extends Produto {
    private int duracao;

    public DVDs(int cod, String nome, double preco, int duracao) {
        super(cod, nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString()
    {
        return(super.toString()+""+duracao);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
