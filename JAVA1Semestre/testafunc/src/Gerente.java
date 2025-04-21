public class Gerente extends Funcionario {
    private int senha;
    private String username;

    public Gerente(String nome, int salario, int senha, String username) {
        super(nome, salario);
        this.senha = senha;
        this.username = username;

        System.out.println("nome: "+nome+", salario: "+salario+", senha: "+senha+ ", username: "+username);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
