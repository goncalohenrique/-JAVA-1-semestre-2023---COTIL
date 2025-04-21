import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(200);
        c1.Depositar(20);
        c1.Sacar(50);
        c1.Transferir(45);

        System.out.println(c1.mostra());

        ContaCorrente c2 = new ContaCorrente(300);
        ContaInvestimento c3 = new ContaInvestimento(500);
        


        try{
            c2.Depositar(-1);
            c2.Sacar(0);
            c2.Transferir(0);

            System.out.println(c2.mostra());

        }
        catch (ValorInvalidoException e)
        {
            System.out.println(e.getMessage());
        }
        catch (SaldoInsuficienteException i)
        {
            System.out.println(i.getMessage());
        }

        try{
            c3.Depositar(30);
            c3.Sacar(40);
            c3.Transferir(25);

            System.out.println(c3.mostra());

        }
        catch (ValorInvalidoException e)
        {
            System.out.println(e.getMessage());
        }
        catch (SaldoInsuficienteException i)
        {
            System.out.println(i.getMessage());
        }

        System.out.println("Termino do programa");

    }
}