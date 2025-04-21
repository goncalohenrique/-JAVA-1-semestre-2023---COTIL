import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Clientes c1 = new Clientes("Duda","sua",159841);
        PessoasFisicas pf = new PessoasFisicas("Judas","Casa",1564,0001);
        PessoasJuridicas pj= new PessoasJuridicas("Vado","apart",3565,15456);
        Produto p1 = new Produto(258,"bom",4,2);
        Eletrico e1 = new Eletrico(569,"otimo",7,4);
        Hidraulico h1 = new Hidraulico(896,"Maravilha",6,5);
        Alvenaria a1 = new Alvenaria(251,"Qualidade",2,3);


        ArrayList <Produto> Lista= new ArrayList<Produto>();
        Lista.add(p1);
        Lista.add(e1);
        Lista.add(h1);
        Lista.add(a1);

        for (Produto p: Lista)
        {
            if (p instanceof Produto)
            {
                if (p instanceof Alvenaria)
                {
                    Produto A= (Produto) p;
                    System.out.println(A.getPreco()<100);
                }
            }
        }

        ArrayList<Clientes> L2= new ArrayList<Clientes>();
        L2.add(c1);
        L2.add(pf);
        L2.add(pj);

        for (Clientes c: L2)
        {
            if (c instanceof Clientes)
            {
                Clientes x=(Clientes) c;
                if (c.getNome().startsWith("A"))
                {
                    System.out.println("NOME:"+c.getNome());
                }
            }

        }

    }
}