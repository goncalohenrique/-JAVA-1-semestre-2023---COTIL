public class Ponto3D extends  Ponto2D{
    private double coordz;

    public Ponto3D(double coordx, double coordy, double coordz) {
        super(coordx, coordy);
        this.coordz=coordz;
    }

    @Override
    public String toString() {
        return ("Coordenada x: " + getCoordx() + ", coordenada y: "+getCoordy()+" e coordenada z: "+coordz);
    }
}
