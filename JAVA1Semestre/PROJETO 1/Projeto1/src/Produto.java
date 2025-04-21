public class Produto {
    private String desc;
    private int preco;
    private int kmRoda;
    private String marca;
    private int ano;

    public Produto(String desc, int preco, int kmRoda, String marca, int ano) {
        this.desc = desc;
        this.preco = preco;
        this.kmRoda = kmRoda;
        this.marca = marca;
        this.ano = ano;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPreco() {
            return preco;
    }

    public void setPreco(int preco) {
    if(preco<=0)
        throw new IllegalArgumentException();
    else {
        this.preco = preco;
    }
    }

    public int getKmRoda() {
        return kmRoda;
    }

    public void setKmRoda(int kmRoda) {
        this.kmRoda = kmRoda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano<=0)
            throw new IllegalArgumentException();
        else {
            this.ano = ano;
        }
    }
}
