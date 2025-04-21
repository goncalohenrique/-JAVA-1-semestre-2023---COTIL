public class Ferrari implements ICarro, IAutomovel, IItemloja {

    @Override
    public void abrirPorta() {

    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerando");
    }

    @Override
    public void parar() {
        System.out.println("Ferrari parando");
    }

    @Override
    public double getValor() {
        return 800000;
    }
}
