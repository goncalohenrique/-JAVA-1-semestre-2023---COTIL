public class Comissionado extends  Empregado{
    private double totalven;
    private double taxacomis;

    public Comissionado(String nome, String sobrenome, int cpf, double totalven, double taxacomis) {
        super(nome, sobrenome, cpf);
        this.totalven = totalven;
        this.taxacomis = taxacomis;
    }

    @Override
    public double vencimento() {
        totalven= totalven*taxacomis;
        return totalven;
    }

    public double getTotalven() {
        return totalven;
    }

    public void setTotalven(double totalven) {
        this.totalven = totalven;
    }

    public double getTaxacomis() {
        return taxacomis;
    }

    public void setTaxacomis(double taxacomis) {
        this.taxacomis = taxacomis;
    }
}
