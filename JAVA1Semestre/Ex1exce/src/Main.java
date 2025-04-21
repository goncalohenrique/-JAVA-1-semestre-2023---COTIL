public class Main {
    public static void main(String[] args)
    {
        String o =null;


        try{
            o.toString();
        }
        catch(NullPointerException e1 ){
        System.out.println("String não pode ser nula");
    }

    }
}