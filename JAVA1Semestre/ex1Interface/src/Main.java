public class Main {
    public static void main(String[] args) {


        TipoPagamento c1 = new CartaoCredito(2);
        TipoPagamento c2= new CartaoCredito(4);
        TipoPagamento d1 = new Dinheiro();
        TipoPagamento d2 = new Dinheiro();
        TipoPagamento ch1 = new Cheque();
        TipoPagamento ch2 = new Cheque();

        System.out.println("Cartao de Credito: " +c1.PorcentagemFina());
        System.out.println("Dinheiro: "+d1.PorcentagemFina());
        System.out.println("Cheque: "+ch2.PorcentagemFina());


    }
}