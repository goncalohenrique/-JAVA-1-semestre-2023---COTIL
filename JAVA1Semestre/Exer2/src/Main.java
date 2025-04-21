public class Main {
    public static void main(String[] args) {

        Item it = new Item(1234,"Muito bom",2,3.00);
        it.setTotal(it.getTotal());
        System.out.println(" O produto de codigo: "+it.getCodigo()+ "Ele é " +it.getDescricao()+ "Vendi "+it.getQuantidadeComprada()+" Com o preco de "+it.getPreco());
        System.out.println("O valor faturado foi de " +it.getTotal());



    }
}