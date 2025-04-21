public class ContaCorrente extends ContaBancaria{


    public double mostra()
    {
        return saldo;
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public double calcularSaldo(double saldo)
    {
        return saldo=saldo-saldo*0.9;
    }
}
