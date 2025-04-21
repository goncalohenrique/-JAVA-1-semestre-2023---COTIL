public class Main {
    public static void main(String[] args) {


        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        try
        {
            a1.setAlt(-1);;
        }
        catch (AlturaNegativaException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            a2.setNome(null);;
        }
        catch (NomeNegativoException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            a3.setRa(-1);
        }
        catch (RaNegativoException e)
        {
            System.out.println(e.getMessage());
        }


    }
}