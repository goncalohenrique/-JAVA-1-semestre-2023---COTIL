import java.util.ArrayList;

public class Main {
    public static void main(String[] args)

    {
        double totvendas = 0;
       Assalariado a1 = new Assalariado("Gonçalo", "Cruz", 219463, 500000);
       Assalariado a2 = new Assalariado("Duda", "Demonte", 3935645, 300000);

       Comissionado c1 = new Comissionado("Cauan", "Jesus", 3297430, 150000,0.20);
       Comissionado c2 = new Comissionado("Marcos", "Antonio", 9649546, 200000,0.10);

       Horista h1 = new Horista("Tania", "Basso", 363056, 100, 400);
       Horista h2 = new Horista("Daniela", "Mendonça", 576289, 100, 250);

        ArrayList<Empregado> lista = new ArrayList<Empregado>();
        lista.add(a1);
        lista.add(a2);
        lista.add(c1);
        lista.add(c2);
        lista.add(h1);
        lista.add(h2);

        for( Empregado e : lista)
        {
            e.vencimento();
            if(e instanceof Comissionado)
            {
                totvendas += ((Comissionado) e).getTotalven();
            }
        }
        System.out.println("Total de vendas é: "+ totvendas);
        
    }
}