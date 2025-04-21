public class Main {
    public static void main(String[] args)
    {
       RegistroAcademico r1 = new RegistroAcademico("Duda",202251,0.1);
        RegistroAcademico r2 = new RegistroAcademico("Goncalo",202233,0.1);
        RegistroAcademico r3 = new RegistroAcademico("Marcos",202156,0.1);
        RegistroAcademico r4 = new RegistroAcademico("Cauan",202257,0.1);
        System.out.println(RegistroAcademico.getNumeroMatricula());

        System.out.println(" A " +r1.getNome()+ " codCurso " +r1.getCodCurso()+ " Percentual " +r1.getPercentualCobranca());
    }
}