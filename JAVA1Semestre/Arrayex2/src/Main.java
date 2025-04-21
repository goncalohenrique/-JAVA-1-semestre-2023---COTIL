import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Imovel i1 = new Imovel("Casa",1200);
        Novo n1 = new Novo("Predio",2500,100);
        Antigo a1 = new Antigo("Condominio",3000,200);

        ArrayList<Imovel> Lista= new ArrayList<Imovel>();
        Lista.add(i1);
        Lista.add(n1);
        Lista.add(a1);

        for (Imovel i: Lista)
        {
            i.imprimi();
            System.out.println("-------");
        }
        for (Imovel i: Lista)
        {
            if(i instanceof Novo)
            {
                Novo n = (Novo)  i;
                n.imprimi();
            }
        }
    }
}