public class Cirurgiao extends Medico{

    public Cirurgiao(boolean trabalhaNoHosp) {
        super(trabalhaNoHosp);
    }
 @Override
    public void trataPaciente()
    {
        System.out.println("O cirurgião atende pacientes.");
    }

    public void fazerIncisao()
    {
        System.out.println("E faz incisão");
    }

}
