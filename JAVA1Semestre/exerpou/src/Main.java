public class Main {
    public static void main(String[] args) {

        Poupanca p1 = new Poupanca(2000);
        Poupanca p2 = new Poupanca(3000);


        p1.calJurosMensais();
        System.out.println("A primeira poupança tem "+p1.getJurosMensal()+ " de Juros e " + p1.getSaldo() +" de saldo total" );

        p2.calJurosMensais();
        System.out.println("A segunda poupança tem "+p2.getJurosMensal()+ " de Juros e " + p2.getSaldo() +" de saldo total");

        Poupanca.modiTaxaJuro();

        p1.calJurosMensais();
        System.out.println("A primeira poupança tem "+p1.getJurosMensal()+ " de Juros e " + p1.getSaldo() +" de saldo total" );

        p2.calJurosMensais();
        System.out.println("A segunda poupança tem "+p2.getJurosMensal()+ " de Juros e " + p2.getSaldo() +" de saldo total");

    }
}