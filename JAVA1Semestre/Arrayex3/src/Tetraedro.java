public class Tetraedro extends FormaTriDimensional{

    private double l;
    private double ab;

    private double h;

    public Tetraedro(double l, double ab, double h) {
        this.l = l;
        this.ab = ab;
        this.h = h;
    }
    @Override

    public double area()
    {
        return l*l/1.73;
    }

    @Override
    public double volume()
    {
        return l*l*1.55/4*h/3;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


}
