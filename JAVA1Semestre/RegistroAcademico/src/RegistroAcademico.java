public class RegistroAcademico {

    private String nome;
    private  static int numeroMatricula=0;
    private int codCurso;
    private double percentualCobranca;

    public RegistroAcademico(String nome, int codCurso, double percentualCobranca) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.percentualCobranca = percentualCobranca;
        numeroMatricula++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {

        return numeroMatricula;
    }

    public static void setNumeroMatricula(int numeroMatricula) {
        RegistroAcademico.numeroMatricula = numeroMatricula;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
}
