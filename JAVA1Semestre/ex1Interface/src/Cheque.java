public class Cheque implements TipoPagamento{

    @Override
    public int DiasFaturamentos() {
        return 3;
    }

    @Override
    public double PorcentagemFina() {
        return 0.3;
    }

    public Cheque() {
    }
}
