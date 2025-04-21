public class Cubo extends FormaTriDimensional{
    private double l;

    public Cubo(double l) {
        this.l = l;
    }

    @Override
    public double volume()
    {
        return l*l*l;
    }

    @Override

    public double area()
    {
        return 6*l*l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
