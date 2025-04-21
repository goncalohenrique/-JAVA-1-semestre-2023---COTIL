public class VIP extends  Ingresso{
    private double valorAdc;


    public VIP(double valorRs, double valorAdc) {
        super(valorRs);
        this.valorAdc = valorAdc;
    }

    public void atualizaValor()
    {
        setValorRs(valorAdc+getValorRs());
    }
@Override
    public void imprimeValor()
    {
        System.out.println("Valor total do ingresso VIP: "+getValorRs());
    }

    public double getValorAdc() {
        return valorAdc;
    }

    public void setValorAdc(double valorAdc) {
        this.valorAdc = valorAdc;
    }
}
