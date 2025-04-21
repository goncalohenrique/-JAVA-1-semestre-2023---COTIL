public class Retangulo {

    private int base;
    private int alt;
    private int per;
    private int area;

    public Retangulo()
    {
        this.base= 1 ;
        this.alt= 1 ;
        per=(2*base+2*alt);
        area=base*alt;
    }

    int Retangulo  (int area,int per)
    {
      return(area);
    }


    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        if((base<1)||(base>20) )
            System.out.println("O valor é invalido");
        else
            System.out.println("O valor é valido");


    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
        if((alt<1)||(alt>20) )
            System.out.println("O valor é invalido");
        else
            System.out.println("O valor é valido");

    }
}
