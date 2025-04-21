public class Main {
    public static void main(String[] args) {

        Funcionario f0 =new Funcionario();
        Funcionario f1 = new Funcionario("Duda","Demonte",1200);
        System.out.println("A "+ f1.getNome() + " Tem o salarioanul de "+ f1.getsal());
        System.out.println( " A " + f1.getNome() + " Teve o salario total de " +f1.getSalanual());

        Funcionario f2 = new Funcionario("Gonçalo", "Cruz", 3000);
        System.out.println("A "+ f2.getNome() + " Tem o salarioanul de "+ f2.getsal());
        System.out.println( " A " + f2.getNome() + " Teve o salario total de " +f2.getSalanual());


    }
}