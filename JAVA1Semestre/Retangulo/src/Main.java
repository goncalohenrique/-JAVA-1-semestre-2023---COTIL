public class Main {
    public static void main(String[] args)
    {
   Retangulo r1 = new Retangulo();
   r1.setAlt(1);
   r1.setBase(1);
   r1.setArea(r1.getArea());
   r1.setPer(r1.getPer());


        System.out.println("O perimetro do retangulo é: "+ r1.getPer() + " \nA area do retangulo é: " + r1.getArea() );

    }
}