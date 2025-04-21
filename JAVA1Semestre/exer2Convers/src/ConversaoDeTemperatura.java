public class ConversaoDeTemperatura
{

    public static void convFaren(double farenheit, double grausCel)
    {
        farenheit=(grausCel*1.8)+32;
        System.out.println(+farenheit);
    }

    public static void convCel(double farenheit, double grausCel)
    {
        grausCel=(farenheit-32)/1.8;
        System.out.println(+grausCel);
    }

}
