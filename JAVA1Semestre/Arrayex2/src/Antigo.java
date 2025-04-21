public class Antigo extends Imovel{

    private double desconto;
    @Override
    public void imprimi()
    {
        System.out.println(desconto);
    }


    public Antigo(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
