public class Produto {
    private int cod;
    private String descricao;
    private double preco=0;
    private int und;

    public Produto(int cod, String descricao, double preco, int und) {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getUnd() {
        return und;
    }

    public void setUnd(int und) {
        this.und = und;
    }
}
