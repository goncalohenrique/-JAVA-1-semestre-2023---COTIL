public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Gonçalo", 123, 50000);
        cb.sacar(40000);
        cb.depositar(50000);
        cb.mostra("duda", 123, 510000);

        ContaPoupanca cp = new ContaPoupanca("duda", 456, 55000);
        cp.sacar(3000);
        cp.depositar(250000);
        cp.mostra("duda", 456, 55000);

        ContaEspecial ce = new ContaEspecial("cauan", 789, 47987, 500000);
        ce.sacar(2000);
        ce.depositar(34000);
        ce.mostra("cauan", 789, 82000);
    }
}