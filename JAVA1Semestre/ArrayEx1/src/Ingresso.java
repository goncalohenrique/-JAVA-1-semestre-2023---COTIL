public class Ingresso {
    private double valorRs;

    public Ingresso(double valorRs) {
        this.valorRs = valorRs;
    }

    public void imprimeValor()
    {
        System.out.println(valorRs);
    }

    public double getValorRs() {
        return valorRs;
    }

    public void setValorRs(double valorRs) {
        this.valorRs = valorRs;
    }
}
