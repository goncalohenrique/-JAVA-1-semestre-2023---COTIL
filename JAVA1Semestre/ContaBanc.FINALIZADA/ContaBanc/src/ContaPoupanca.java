public class ContaPoupanca extends ContaBancaria {
    private int diaRend;

    public ContaPoupanca(String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
    }

    public double calcNovoSaldo(double taxaRend, double saldo)
    {
        saldo=(saldo+taxaRend);
        return saldo;
    }

    @Override
    public void mostra(String cliente, int numConta, double saldo)
    {
        System.out.println("O cliente: "+ cliente+ ", numero de conta: "+ numConta+ ", seu saldo é: "+saldo);
    }

    public int getDiaRend() {
        return diaRend;
    }

    public void setDiaRend(int diaRend) {
        this.diaRend = diaRend;
    }
}
