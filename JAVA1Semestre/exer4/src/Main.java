public class Main {
    public static void main(String[] args)
    {
         Estoque e1 = new Estoque ( "Impressora", 13, 6 );
        Estoque e2 = new Estoque ( "Monitor", 11, 13 );
        Estoque e3 = new Estoque ( "Mouse", 6, 2 );

        e1.darBaixa(5);
        e2.repor(7);
        e3.darBaixa(4);
        e3.precisaRepor();
        e2.precisaRepor();
        e1.precisaRepor();
        e1.mostra();
        e2.mostra();
        e3.mostra();                  





    }
}