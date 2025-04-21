public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calculabonif() {
        salario = (salario + (salario * 0.1));

    }

    public void testafunc()
    {
        System.out.println("\n O salário mais bonificaçao do: "+nome+", é: "+salario);
    }

    public void mostradad()
    {
        System.out.println("O "+nome+", tem o salário de: "+ salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}