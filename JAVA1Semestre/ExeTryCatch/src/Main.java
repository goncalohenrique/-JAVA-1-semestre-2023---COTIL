public class Main {
    public static void main(String[] args) {
        String nome= "tania";
        try {
            System.out.println(nome.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("String não pode ser nula.");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Índice inexistente na string");
        }
        catch (Exception e)
        {
            System.out.println("Erro!!!!!!");
        }
        finally {  //opcional
            System.out.println("Passei no finally.");
        }

        Aluno al1 = new Aluno();

        try{
            al1.setRa(-1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            al1.setNome(null);
        }
        catch (IllegalArgumentException e2)
        {
            System.out.println(e2.getMessage());

        }


        System.out.println("************* FIM *************");
    }
}