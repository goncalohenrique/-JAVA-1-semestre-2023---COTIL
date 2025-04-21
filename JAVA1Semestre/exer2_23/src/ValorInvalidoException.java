public class ValorInvalidoException extends RuntimeException{

    public ValorInvalidoException() {

    }

    public String getMessage()
    {
        System.out.println("Valor negativo");
        return null;
    }

}
