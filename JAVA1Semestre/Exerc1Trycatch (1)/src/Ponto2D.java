public class Ponto2D {
    private double coordx;
    private double coordy;

    public Ponto2D(double coordx, double coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
    }
@Override
    public String toString()
    {
        return ("Coordenada x: " + coordx + " e coordenada y: " + coordy);
    }

    public double getCoordx() {
        return coordx;
    }

    public void setCoordx(int coordx) {
        this.coordx = coordx;
    }

    public double getCoordy() {
        return coordy;
    }

    public void setCoordy(int coordy) {
        this.coordy = coordy;
    }
}
