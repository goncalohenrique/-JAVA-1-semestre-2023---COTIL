public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Aluno al1 = new Aluno(1,"Paulo",7);
        Aluno al2 = new Aluno(2, "Giovanna", 10);
        System.out.println(Aluno.calcCrTurma());
    }
}