public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cachorro("Bombom",17);
        a1.correr();
        a1.som();

        Animal a2 = new Cavalo("TYHj",58);
        a2.som();
        a2.correr();

        Animal a3 = new Preguica("Musuruca",100);
        Preguica p4 =(Preguica) a3;
        p4.SubirArvore();
        a3.som();

    }
}