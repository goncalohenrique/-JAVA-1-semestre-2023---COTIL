public class Poupanca {

    private static double taxaJurosAnual=0.3;
    private double saldo=0;
    private double jurosMensal=0;



    public Poupanca(double saldo)
    {
        this.saldo = saldo;
    }

    public static void modiTaxaJuro()
    {
        taxaJurosAnual=0.4;
    }

    public void calJurosMensais()
    {
        jurosMensal=(saldo*taxaJurosAnual)/12;
        saldo=saldo+(saldo*taxaJurosAnual)/12;

    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual=0.3;
    }

    public double getJurosMensal() {
        return jurosMensal;
    }

    public void setJurosMensal(double jurosMensal) {
        this.jurosMensal = jurosMensal;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
