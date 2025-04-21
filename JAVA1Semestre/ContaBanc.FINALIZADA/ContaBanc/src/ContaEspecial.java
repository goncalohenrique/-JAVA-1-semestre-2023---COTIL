public class ContaEspecial extends ContaBancaria{
    private float limite;
    public ContaEspecial(String cliente, int numConta, double saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite= limite;
    }

    @Override
    public void mostra(String cliente, int numConta, double saldo)
    {
        System.out.println("O cliente: "+ cliente+ ", numero de conta: "+ numConta+ ", seu saldo é: "+saldo+ " e o limite da conta especial é: "+limite);
    }

    public double sacar(double numSaque, double saldo)
    {
        if(numSaque<=saldo)
            saldo=saldo-numSaque;
        else
            System.out.println("Erro, não é possível sacar um valor maior que seu saldo." +
                    "Saldo: "+saldo);
        return saldo;
    }

}
