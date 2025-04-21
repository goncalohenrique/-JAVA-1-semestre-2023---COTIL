public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico(false) {
        };
        m1.trataPaciente();

        ClinicoGeral cg1 = new ClinicoGeral(true, true){
        };
        cg1.trataPaciente();
        cg1.receitar();

        Cirurgiao c1 = new Cirurgiao(true){
        };
        c1.trataPaciente();
        c1.fazerIncisao();
    }
}