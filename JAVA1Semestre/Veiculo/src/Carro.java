public class Carro extends Veiculos {
  private double km;

  public Carro(String modelo, double preco, double km) {
    super(modelo, preco);
    this.km = km;
  }

  @Override
  public void printDados() {
    super.printDados();
    System.out.println(km);
  }

  public double getKm() {
    return km;
  }

  public void setKm(double km) {
    this.km = km;
  }
}
