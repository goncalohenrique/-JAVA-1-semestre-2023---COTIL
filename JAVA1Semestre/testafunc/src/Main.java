public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Duda",10000);
        f1.calculabonif();
        f1.testafunc();

        Gerente g1 = new Gerente("Gonçalo",9000,2500,"gonçalo");
        g1.calculabonif();
        g1.testafunc();

        Telefonistas t1 = new Telefonistas("Leticia",8000,3698);
        t1.calculabonif();
        t1.testafunc();

        Secretarias s1 = new Secretarias("Tania",20000,258);
        s1.calculabonif();
        s1.testafunc();
    }
}