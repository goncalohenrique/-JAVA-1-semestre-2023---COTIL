public class Eletrico extends Produto{

    public Eletrico(int cod, String descricao, double preco, int und) {
        super(cod, descricao, preco, und);
    }

    public void mostra(double preco)
    {
        double desconto=preco-preco*0.2;
    }
}
