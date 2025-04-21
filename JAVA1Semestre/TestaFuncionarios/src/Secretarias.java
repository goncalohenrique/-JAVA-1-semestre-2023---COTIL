public class Secretarias extends Funcionario{
    private int numeroRamal;

    public Secretarias(String nome, int salario, int numeroRamal) {
        super(nome, salario);
        this.numeroRamal = numeroRamal;
        System.out.println("nome: "+nome+", salario: "+salario+", numero ramal:"+numeroRamal);
    }

    @Override
    public void mostradad() {
        super.mostradad();
        System.out.println("e seu numero ramal é: "+numeroRamal);
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}