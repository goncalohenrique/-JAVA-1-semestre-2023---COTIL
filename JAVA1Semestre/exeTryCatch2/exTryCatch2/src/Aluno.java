import com.sun.istack.internal.localization.NullLocalizable;

public class Aluno {

    private int ra;
    private String nome;
    private double alt;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0)
        {
            throw new RaNegativoException();
        }
        else {
            this.ra = ra;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome==null)
        {
            throw new NomeNegativoException();
        }
        else
        {
            this.nome = nome;
        }

    }

    public double getAlt(int i) {
        return alt;
    }

    public void setAlt(double alt) {
        if(alt<0)
        {
            throw new AlturaNegativaException();
        }
        else
        {
            this.alt = alt;
        }

    }
}
