public class Telefonistas extends Funcionario{
    private int codigo;

    public Telefonistas(String nome, int salario, int codigo) {
        super(nome, salario);
        this.codigo = codigo;
        System.out.println("nome: "+nome+", salario: "+salario+", codigo:"+codigo);
    }

    @Override
    public void mostradad() {
        super.mostradad();
        System.out.println(" e o código: "+codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}