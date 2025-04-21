public class Aluno extends Pessoa
{
    private int ra;

    public Aluno(int cpf, String nome, int ra) {
        super(cpf, nome);
        this.ra=ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
