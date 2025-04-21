public class Circulo extends FormaBiDimensional{

    private double r;
@Override
    public double area()
    {
        double area=3*r*r;
        return area;
    }

    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
