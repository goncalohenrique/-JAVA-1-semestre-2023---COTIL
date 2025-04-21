public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Duda",10000);
        f1.calculabonif();
        f1.testafunc();
        f1.mostradad();

        Gerentes g1 = new Gerentes("Gonçalo",9000,2500,"gonçalo");
        g1.calculabonif();
        g1.testafunc();
        g1.mostradad();

        Telefonistas t1 = new Telefonistas("Leticia",8000,3698);
        t1.calculabonif();
        t1.testafunc();
        t1.mostradad();

        Secretarias s1 = new Secretarias("Tania",20000,258);
        s1.calculabonif();
        s1.testafunc();
        s1.mostradad();
    }



}