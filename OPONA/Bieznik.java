// Andrzej Pytka nr albumu Nr albumu 11727
package OPONA;

public interface Bieznik
{
    String wzor = null;

    public static void rodzaj(String wzor)
    {
        double wWagi = 1.0;
        if (wzor.equals("terenowy")) wWagi = 1.2;
        else if (wzor.equals("torowy")) wWagi = 0.8;
       // return wWagi;
    }
}
