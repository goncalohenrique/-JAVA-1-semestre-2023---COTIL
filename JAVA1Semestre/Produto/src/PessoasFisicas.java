public class PessoasFisicas extends Clientes {

    private int cpf;

    public PessoasFisicas(String nome, String endereco, int telefone, int cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
