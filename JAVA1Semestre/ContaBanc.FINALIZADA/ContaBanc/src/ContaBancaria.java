public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double sacar(double numSaque)
    {
        if(numSaque<=saldo)
        saldo=saldo-numSaque;
        else
            System.out.println("Erro, não é possível sacar um valor maior que seu saldo." +
                    "Saldo: "+saldo);
        return saldo;
    }

    public double depositar(double numDepo)
    {
        saldo=saldo+numDepo;
        return saldo;
    }

    public void mostra(String cliente, int numConta, double saldo)
    {
        System.out.println("O cliente: "+ cliente+ ", numero de conta: "+ numConta+ ", seu saldo é: "+saldo);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
