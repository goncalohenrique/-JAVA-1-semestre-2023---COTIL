public class Salario extends Empresa{

    private double sal=0;

    public Salario(String nome, double sal) {
        super(nome);
        this.sal = sal;
    }
    @Override
    public double getPay()
    {
        return sal;
    }
    @Override
    public void mostra()
    {
        System.out.println(sal);
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
