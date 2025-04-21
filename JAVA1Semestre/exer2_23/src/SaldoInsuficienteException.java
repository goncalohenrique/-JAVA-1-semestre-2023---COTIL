public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException() {

    }

    public String getMessage()
    {
        System.out.println("Saldo negativo");
        return null;
    }

}
