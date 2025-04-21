public class Pessoa
{
    private String nomePessoa;
    private int dia;
    private int mes;
    private int ano;
    private int idade;

    public void calculaIdae()
    {
        idade=2023-ano;
    }

    public Pessoa(int d, int m, int a)
    {
        dia=d;
        mes=m;
        ano=a;
    }

    public Pessoa(int d, int m, int a, String no)
    {
        dia=d;
        mes=m;
        ano=a;
        nomePessoa=no;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((dia>=1)&&(dia<=31))
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if((mes>=1)&&(mes<=12))
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>=1000)
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
