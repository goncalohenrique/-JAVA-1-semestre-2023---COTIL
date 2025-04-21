public class CalcMaMe
{
    private static int maior;
    private static int menor;

    public static void calcumm (int a, int b) {
        if (a > b) {
            maior = a;
            menor = b;
        }
        if (b > a) {
            maior = b;
            menor = a;
        }
    }

    public static void calcumm2 (int c)
    {
        if(maior>c)
        menor=c;
        else
        maior=c;
    }
    public static void calcumm3 (int d)
    {
        if(maior>d)
            menor=d;
        else
            maior=d;

        System.out.println("maior: "+maior);
        System.out.println("menor: "+menor);

    }

    public static int getMaior() {
        return maior;
    }

    public static void setMaior(int maior) {
        CalcMaMe.maior = maior;
    }

    public static int getMenor() {
        return menor;
    }

    public static void setMenor(int menor) {
        CalcMaMe.menor = menor;
    }
}
