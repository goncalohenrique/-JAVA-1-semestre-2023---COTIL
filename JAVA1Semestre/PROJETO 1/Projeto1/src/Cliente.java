public class Cliente extends  Pessoa implements IPessoa{

    private int codloja;

    public Cliente(int idade, String nome, int cpf, String email, int codloja) {
        super(idade, nome, cpf, email);
        this.codloja = codloja;
    }

    @Override
    public String exibir() {
        return null;
    }

    public int getCodloja() {
        return codloja;
    }

    public void setCodloja(int codloja) {
        this.codloja = codloja;
    }
}
