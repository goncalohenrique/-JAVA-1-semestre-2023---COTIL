public class Estoque
{
    private String nome;
    private int qtdAtual;
    private int qtdMinima;


    public void informacoes()
    {
        nome="";
        qtdAtual=0;
        qtdMinima=0;
    }

    public void mostra()
    {
        System.out.println("o "+ nome + " com " + qtdMinima + " de quantidade mínima, esta com o estoque de "+ qtdAtual);
    }

    public Estoque(String n, int qta, int qtm)
    {
        nome=n;
        qtdAtual=qta;
        qtdMinima=qtm;
    }

    public int repor( int qtd)
    {
        qtdAtual+=qtd;
        return qtdAtual;
    }

    public int darBaixa(int qtd)
    {
        qtdAtual-=qtd;
        return qtdAtual;
    }

    public boolean precisaRepor()
    {
        if(qtdAtual<=qtdMinima)
            return true;
        else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if(qtdAtual>=0)
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if(qtdMinima>=0)
        this.qtdMinima = qtdMinima;
    }
}
