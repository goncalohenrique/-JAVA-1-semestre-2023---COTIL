public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(14,10,1879);
        p1.setNomePessoa("Albert Einstein");
        p1.calculaIdae();
        System.out.println(" A idade do " + p1.getNomePessoa() + " é " +p1.getIdade());

        Pessoa p2 = new Pessoa(4,1,1643,"Isaac Newton");
        p2.calculaIdae();
        System.out.println(" A idade do " + p2.getNomePessoa() + " é " +p2.getIdade());


    }
}