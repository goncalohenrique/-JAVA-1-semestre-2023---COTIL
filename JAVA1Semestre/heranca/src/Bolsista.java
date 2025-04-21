public class Bolsista extends Aluno {
    private double bolsa;


    public Bolsista(int cpf, String nome, int ra, double bolsa) {
        super(cpf, nome, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
