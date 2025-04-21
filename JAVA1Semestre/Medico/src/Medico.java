public abstract class Medico {
    private boolean trabalhaNoHosp;

    public Medico(boolean trabalhaNoHosp) {
        this.trabalhaNoHosp = trabalhaNoHosp;
    }

    public void trataPaciente()
    {
        if (trabalhaNoHosp==true)
        System.out.println("O medico atende pacientes.");
    }

    public boolean isTrabalhaNoHosp() {
        return trabalhaNoHosp;
    }

    public void setTrabalhaNoHosp() {
        this.trabalhaNoHosp = trabalhaNoHosp;
    }
}
