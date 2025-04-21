public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CalculoMatematico c1 = new CalculoMatematico(4,0);
        
        try
        {
            System.out.println(c1.getR());
        }
        catch(ArithmeticException e)
        {
            System.out.println("ERRO!!, não pode retornar zero");
        }
    }




}