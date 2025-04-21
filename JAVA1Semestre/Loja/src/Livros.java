public class Livros extends Produto{
    private String autor;

    public Livros(int cod, String nome, double preco, String autor) {
        super(cod, nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString()
    {
        return(super.toString()+""+autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
