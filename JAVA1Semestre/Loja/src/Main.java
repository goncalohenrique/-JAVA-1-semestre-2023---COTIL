import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner escolha = new Scanner(System.in);
        Scanner codig = new Scanner(System.in);
        int esc;
        int codi;
        Livros l1 = new Livros(123, "Harry potter", 50, "Tania");
        Livros l2 = new Livros(234,"Diário de Anne Frank", 70, "Anne Frank");
        CDs c1 = new CDs(378, "patati", 20, 30);
        DVDs dv1 = new DVDs(56789, "Piratas do Caribe", 35, 140);
        DVDs dv2 = new DVDs(12345, "Titanic", 30, 130);

        ArrayList<Produto> lista = new ArrayList<Produto>();
        lista.add(l1);
        lista.add(l2);
        lista.add(c1);
        lista.add(dv1);
        lista.add(dv2);

        for(Produto p : lista) {
            System.out.println(p.toString());
            System.out.println("---------");
        }

        System.out.println("Digíte um código: ");
        codi= codig.nextInt();
        for (Produto p2 : lista)
        {
            if(codi==p2.getCod())
            {
                System.out.println(p2.toString());
                break;
            }
            else
            {
                System.out.println("Codigo não encontrado");
            }

        }

            System.out.println("Digíte 1 para livros, 2 para CDs e 3 para DVDs: ");
            esc=escolha.nextInt();

            switch (esc) {
                case 1:
                    System.out.println(l1.toString()+"\n"+l2.toString());
                    break;
                case 2:
                    System.out.println(c1.toString());
                    break;
                case 3:
                    System.out.println(dv1.toString()+"\n"+dv2.toString());
                    break;
                default:
                    System.out.println("Escolha nao encontrada.");
            }
    }
}