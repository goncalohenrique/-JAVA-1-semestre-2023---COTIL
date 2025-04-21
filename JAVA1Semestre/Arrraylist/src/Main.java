import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto(1,"Produto");
        Livro l1 = new Livro(18,"Livro bom","Crepúsculo");
        Garrafa g1 = new Garrafa(25,"stanley",1);

        ArrayList <Produto>lista = new ArrayList<Produto>();
        lista.add(p1);
        lista.add(l1);
        lista.add(g1);

        for (Produto p: lista)
        {
            p.mostra();
            if(p instanceof Livro)
            {
                Livro l = (Livro) p;
                l.ler();
            }
            if(p instanceof Garrafa)
            {
                Garrafa g = (Garrafa) p;
                g.encher();
            }
            System.out.println("---------------");
        }
    }
}