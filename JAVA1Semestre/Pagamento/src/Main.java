import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         double soma=0;

        Empresa e1 = new Empresa("Emporio Tres Marias");
        Salario s1 = new Salario("Joao",1500);
        Hora h1 = new Hora("Julia",8,6);

        ArrayList<Empresa>Lista= new ArrayList<Empresa>();
        Lista.add(e1);
        Lista.add(s1);
        Lista.add(h1);



        for(Empresa e: Lista)
        {
            e.mostra();
            soma+=e.getPay();
            if (e instanceof Salario)
            {
                s1.mostra();
            }
            if (e instanceof Hora)
            {
                h1.mostra();
            }
        }
        System.out.println(soma);
    }
}