public class Livro extends Produto{
    private String titulo;
    @Override

    public void mostra()
    {
        super.mostra();
        System.out.println(titulo);
    }
    public Livro(int codigo, String descricao,String titulo) {
        super(codigo, descricao);
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void ler(){
        System.out.println("Estou lendo");

    }
}
