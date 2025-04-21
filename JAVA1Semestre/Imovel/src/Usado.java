public class Usado extends Local{

    private double descontoPreco;

    public Usado(int codigo, String endereco, double preco, double descontoPreco) {
        super(codigo, endereco, preco);
        this.descontoPreco = descontoPreco;
    } public void mostra()
    {
        System.out.println("Desconto do produto: " +descontoPreco);
    }
    @Override
    public void Imprimir(int codigo, String endereco, double preco) {
        System.out.println("Codigo: " +codigo+ ", Endereço: " +endereco+ ", Preço: " +preco+ ", Desconto Preço: " +descontoPreco);
    }

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
}
