public class Novo extends Local{
    private double precoAdicional;

    public Novo( int codigo, String endereco, double preco, double precoAdicional) {
        super(codigo, endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public void mostra()
    {
        System.out.println("O preço adicional é: " +precoAdicional);
    }

    @Override
    public void Imprimir(int codigo, String endereco, double preco) {
        System.out.println("Codigo: " +codigo+ ", Endereço: " +endereco+ ", Preço: " +preco+ ", Preço Adicional: " +precoAdicional);
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
}
