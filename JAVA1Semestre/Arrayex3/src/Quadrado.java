public class Quadrado extends FormaBiDimensional{

    private double l;

    @Override
    public double area()
    {
        double area=l*l;
        return area;
    }

    public Quadrado(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
