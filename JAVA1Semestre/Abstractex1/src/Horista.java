public class Horista extends Empregado {
    private double precohora;
    private double horastrab;

    public Horista(String nome, String sobrenome, int cpf, double precohora, double horastrab) {
        super(nome, sobrenome, cpf);
        this.precohora = precohora;
        this.horastrab = horastrab;
    }

    @Override
    public double vencimento() {
        precohora=precohora*horastrab;
        return precohora;
    }

    public double getPrecohora() {
        return precohora;
    }

    public void setPrecohora(double precohora) {
        this.precohora = precohora;
    }

    public double getHorastrab() {
        return horastrab;
    }

    public void setHorastrab(double horastrab) {
        this.horastrab = horastrab;
    }
}
