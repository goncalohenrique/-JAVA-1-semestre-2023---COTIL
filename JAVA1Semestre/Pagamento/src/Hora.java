public class Hora extends Empresa{

    private  double hora;
    private double ht;
    private double soma1=0;

    public Hora(String nome, double hora, double ht) {
        super(nome);
        this.hora = hora;
        this.ht = ht;
    }
    @Override
    public double getPay()
    {
        return hora*ht;
    }
    @Override
    public void mostra()
    {
        System.out.println(getHt());
    }
    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getHt() {
        soma1+=ht;
        return ht;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }
}
