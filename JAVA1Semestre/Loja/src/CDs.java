public class CDs extends Produto {
    private int numFaixas;

    public CDs(int cod, String nome, double preco, int numFaixas) {
        super(cod, nome, preco);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString()
    {
        return(super.toString()+""+numFaixas);
    }


    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
}
