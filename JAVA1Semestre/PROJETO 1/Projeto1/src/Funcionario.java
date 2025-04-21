public class Funcionario extends Pessoa implements IPessoa{

    private int codTrabalho;

    public Funcionario(int idade, String nome, int cpf, String email, int
                       codTrabalho) {
        super(idade, nome, cpf, email);
        this.codTrabalho=codTrabalho;
    }


    @Override
    public String exibir() {
        return null;
    }
}
