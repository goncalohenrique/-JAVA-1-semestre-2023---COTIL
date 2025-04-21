public abstract class  Pessoa {
    private int idade;
    private String nome;
    private int cpf;
    private String email;

    public Pessoa(int idade, String nome, int cpf, String email) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

    if(idade<=0)
        throw new IllegalArgumentException("IDADE NEGATIVA NÃO EXISTE"+idade);
    else {
        this.idade = idade;
    }
         }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null)
            throw new IllegalArgumentException("NOME NÃO PODE SER NULO"+nome);
        else {
            this.nome = nome;
        }

    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
