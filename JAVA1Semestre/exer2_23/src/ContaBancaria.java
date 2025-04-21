public class ContaBancaria {

    protected double saldo;
    private double valor;

    public double calcularSaldo(double saldo)
    {
        return saldo;
    }

    public double mostra()
    {
        return saldo;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double CalcularSaldo(double saldo)
    {
        return saldo;
    }

    public Double Depositar(double valor)
    {
        if(valor<0)
            throw new ValorInvalidoException();

        else
        {
            return saldo=saldo+valor;
        }

    }

    public Double Sacar(double valor)
    {
        if(valor<0)
        {
            throw new ValorInvalidoException();
        }
        if (valor>saldo)
        {
            throw new SaldoInsuficienteException();
        }
        else
        {
            return  saldo=saldo-valor;
        }

    }

    public Double Transferir(double valor)
    {
        if(valor<0)
        {
            throw new ValorInvalidoException();
        }
        if (valor>saldo)
        {
            throw new SaldoInsuficienteException();
        }
        else
        {
            return  saldo=saldo-valor;
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (valor>saldo)
        {
            throw new SaldoInsuficienteException();
        }
        else
        {
            this.saldo = saldo;
        }

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {

        if(valor<0)
        {
            throw new ValorInvalidoException();
        }

        else
        {
            this.valor = valor;
        }

    }


}
