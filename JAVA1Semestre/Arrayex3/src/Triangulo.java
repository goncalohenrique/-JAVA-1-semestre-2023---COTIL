public class Triangulo extends FormaBiDimensional{

    private double  b;
    private double h;

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area()
    {
        double area= (b*h)/2;
        return area;
    }

    public Triangulo(double b) {
        this.b = b;
    }

    public double getL() {
        return b;
    }

    public void setL(double b) {
        this.b= b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
