import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        double soma = 0;
        int qtdm=0;
        int qtdc=0;
        double carbar=0;
        double motobar=0;

     Carro c1 = new Carro("BMW M5", 500000, 0);
     Carro c2 = new Carro("Gr Supra", 650000, 150000 );
     Moto m1 = new Moto("XJ6", 200000, 2016);
     Moto m2 = new Moto("kawasaki", 40000, 2007);

        ArrayList<Veiculos> lista = new ArrayList<Veiculos>();
        lista.add(c1);
        lista.add(c2);
        lista.add(m1);
        lista.add(m2);

        for (Veiculos v : lista){
           v.printDados();
           soma+=v.getPreco();
        }

        System.out.println("Soma dos valores dos veiculos sem reajustes e/ou reduções é: "+soma);

        for (Veiculos v2 : lista)
        {
            if (v2 instanceof  Moto)
            {
                if(((Moto) v2).getAno()>=2008)
                    v2.setPreco(v2.getPreco()*1.1);
                qtdm++;
                if(motobar<v2.getPreco())
                    motobar= v2.getPreco();
            }

            if (v2 instanceof  Carro)
            {
                if(((Carro) v2).getKm()>100000)
                    v2.setPreco(v2.getPreco()*0.92);
                qtdc++;
               if(carbar< v2.getPreco())
                   carbar= v2.getPreco();
            }

        }

        System.out.println("Soma dos valores dos veiculos com reajustes e/ou reduções é: "+soma);
        System.out.println("Quantidade de motos cadastradas: "+qtdm);
        System.out.println("Quantidade de carros cadastradas: "+qtdc);

        for (Veiculos v3 : lista)
        {
            if(v3.getPreco() == carbar)
            {
                v3.printDados();
            }
            if(v3.getPreco() == motobar)
            {
                v3.printDados();
            }
        }



    }
}