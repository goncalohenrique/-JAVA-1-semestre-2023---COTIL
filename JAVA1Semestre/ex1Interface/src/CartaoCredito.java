public class CartaoCredito implements TipoPagamento{

    private double valor;

    @Override
    public int DiasFaturamentos() {
        return 20;
    }


    @Override
    public double PorcentagemFina() {
        return 1.10;
    }

    public CartaoCredito(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
