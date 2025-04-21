public class ContaInvestimento extends ContaBancaria{


    public double mostra()
    {
        return saldo;
    }

    public ContaInvestimento(double saldo) {
        super(saldo);
    }

    public double calcularSaldo(double saldo)
    {
        return saldo=saldo+saldo*1.05;
    }
}
