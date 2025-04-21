public class Novo extends Imovel{

    private double adicionarpreco;
    @Override
    public void imprimi()
    {
        super.imprimi();
        System.out.println(adicionarpreco);

    }

    public Novo(String endereco, double preco, double adicionarpreco) {
        super(endereco, preco);
        this.adicionarpreco = adicionarpreco;
    }

    public double getAdicionarpreco() {
        return adicionarpreco;
    }

    public void setAdicionarpreco(double adicionarpreco) {
        this.adicionarpreco = adicionarpreco;
    }
}
