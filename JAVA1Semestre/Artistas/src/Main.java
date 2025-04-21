import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Artista a1 = new Artista(258, "Duda", "Brasil");
        Artista a2 = new Artista(369, "Samuel", "Cancun");
        Musica m1 = new Musica(123, "Call of", 2, "As melhores", "Anitta");
        Musica m2 = new Musica(157, "Pode ligar", 3, "Isso ai", "Madonna");

        ArrayList<Artista> l1 = new ArrayList<Artista>();
        l1.add(a1);
        l1.add(a2);

        ArrayList<Musica> l2 = new ArrayList<Musica>();
        l2.add(m1);
        l2.add(m2);

        int n1;
        do {
            System.out.println("[1]-  Nome Artista");
            System.out.println("[2]- Nacionalidade Artista");
            System.out.println("[3]- Buscar Musicas de um determinado album");
            System.out.println("[4]- Sair");
            n1 = tc.nextInt();
            tc.nextLine();

            switch (n1) {
                case 1:
                    System.out.println("Nome Artista");
                    String n = tc.nextLine();
                    for (Artista a : l1) {
                        if (a1.getNome().equals(n)) {
                            System.out.println(a1.getNome());
                        }

                    }
                    break;

                case 2:
                    System.out.println("Nacionalidade Artista");
                    String na = tc.nextLine();
                    for (Artista a : l1) {
                        if (a1.getNaci().equals(na)) {
                            System.out.println(a1.mostra());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Musica");
                    String mu = tc.nextLine();
                    for (Musica m : l2) {
                        if (m1.getAlbum().equals(mu)) {
                            System.out.println(m1.mostra());
                        }
                    }
                    break;

                case 4:
                default:
            }

            }while (n1!=4);


        }
    }
