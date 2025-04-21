public class NomeNegativoException extends RuntimeException{

    public String getMessage()
    {
        System.out.println("O nome não pode ser negativo");
        return null;
    }
}
