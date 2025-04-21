import java.text.Normalizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circulo c1= new Circulo(2);
        Cubo cu = new Cubo(3);
        Esfera e1 = new Esfera(1);
        Quadrado q1= new Quadrado(6);
        Tetraedro t1 = new Tetraedro(2,4,5);
        Triangulo tri = new Triangulo(4,5);

        ArrayList<Forma> Lista= new ArrayList<Forma>();
        Lista.add(c1);
        Lista.add(cu);
        Lista.add(e1);
        Lista.add(q1);
        Lista.add(t1);
        Lista.add(tri);

        for (Forma f: Lista) {
            if (f instanceof FormaBiDimensional) {
                System.out.println("Forma Bidimencional");
                System.out.println(f.area());
            }
        }
        for(Forma f2: Lista)
        {
            if (f2 instanceof FormaTriDimensional)
            {
                System.out.println("Forma Tridimencional");
                System.out.println(f2.area());
                Forma f = (FormaTriDimensional) f2;
                ((FormaTriDimensional) f2).volume();
                System.out.println(((FormaTriDimensional) f2).volume());


            }
        }








    }
}