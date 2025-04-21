public class ClinicoGeral extends Medico{

    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHosp, boolean atendeEmCasa) {
        super(trabalhaNoHosp);
        this.atendeEmCasa = atendeEmCasa;
    }
   @Override
    public void trataPaciente()
    {
        System.out.println("O Clínico geral atende pacientes.");
    }

    public void receitar()
    {
        System.out.println("O clínico receitou Dipirona");
    }

    public ClinicoGeral(boolean trabalhaNoHosp) {
        super(trabalhaNoHosp);
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}
