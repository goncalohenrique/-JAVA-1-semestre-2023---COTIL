public class Esfera extends FormaTriDimensional{

    private double r;

    @Override
    public double area()
    {
        return (4*3*r*r);
    }
    @Override
    public double volume()
    {
        return 4/3*3.14*r*r*r ;
    }

    public Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
