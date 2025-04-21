public class PessoasJuridicas extends Clientes{

    private int cnpj;

    public PessoasJuridicas(String nome, String endereco, int telefone, int cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
