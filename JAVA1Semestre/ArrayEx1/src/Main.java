import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int soma = 0;
        Ingresso i1 = new Ingresso(30);
        VIP v1 = new VIP(30, 15);
        Comum c1 = new Comum(35);

        ArrayList <Ingresso> lista = new ArrayList<Ingresso>();
        lista.add(i1);
        lista.add(v1);
        lista.add(c1);

        for(Ingresso i:lista)
        {
            if(i instanceof VIP)
            {

                VIP v =(VIP) i;
                v.atualizaValor();
            }
            i.imprimeValor();
          soma+=i.getValorRs();
        }

        System.out.println("Faturamento total: "+soma);

    }


}