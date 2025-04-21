public class Gerentes extends Funcionario {
    private int senha;
    private String username;

    public Gerentes(String nome, int salario, int senha, String username) {
        super(nome, salario);
        this.senha = senha;
        this.username = username;

        System.out.println("nome: "+nome+", salario: "+salario+", senha: "+senha+ ", username: "+username);
    }

    @Override
    public void calculabonif() {
        super.calculabonif();
    }

    @Override
    public void mostradad() {
        super.mostradad();
        System.out.println(", sua senha é: "+senha+" e seu username é:"+username);
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