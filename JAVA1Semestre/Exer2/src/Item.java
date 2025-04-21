public class Item
{
public int codigo;
public String descricao;
public int quantidadeComprada;
public double preco;
public double total;

    public double getTotal() {
        if(quantidadeComprada>0)
            total=(quantidadeComprada*preco);
        else {
            quantidadeComprada=0;
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;

    }

    public Item(int c, String d, int q, double p)
    {
        codigo=c;
        descricao=d;
        quantidadeComprada=q;
        preco=p;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
