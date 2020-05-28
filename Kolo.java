// Andrzej Pytka nr albumu Nr albumu 11727

// Klasa główna zbiera informacje o kole samochodu

import OPONA.Opona;
import FELGA.*;

public class Kolo
{

    public static void main (String[] args)
    {
 /*     Wymiary kół średnica, szerokość, profil, Materiał felg,
        do przerobienia na tabelę
        TabSet kLewyPprzod[] {16.0, 5.0, "FE", }; //cale
        kPrawyPrzod = 16;
        kLewyTyl = 20;
        kPrawyTyl = 20;
*/
        String felgapl;String felgapp;String felgatl;String felgatp;

        new FELGA.Felga(16.0, 5.0, "Stal");
        felgapl = Felga.retRFelgaInfo;
        new FELGA.Felga(16.0, 5.0, "Stal");
        felgapp = Felga.retRFelgaInfo;
        new FELGA.Felga(20.0, 5.5, "Aluminium");
        felgatl = Felga.retRFelgaInfo;
        new FELGA.Felga(20.0, 5.5, "Aluminium");
        felgatp = Felga.retRFelgaInfo;
        System.out.println("Koło przednie lewe ");
        System.out.println(felgapl);
        System.out.println("Koło przednie prawe ");
        System.out.println(felgapp);
        System.out.println("Koło tylne lewe ");
        System.out.println(felgatl);
        System.out.println("Koło tylne prawe ");
        System.out.println(felgatp);
 //
//        System.out.println(Felga.retRFelgaInfo);
 //       System.out.println(felgapl);
        Opona oponapl = new Opona() {
            public String toString() {
                return super.toString();
            }
        };
        System.out.println(Opona.guma);

  /*      System.out.println(oponapl)

        System.out.println("Koło przednie prawe ");
        Felga felgapp = new FELGA.Felga(16.0, 5.0, "Stal");
        System.out.println(Felga.retRFelgaInfo);

        System.out.println("Koło tylne lewe ");
        Felga felgatl = new FELGA.Felga(20.0, 5.5, "Stal");
        System.out.println(Felga.retRFelgaInfo);

        System.out.println("Koło tylne prawe ");
        Felga felgatp = new FELGA.Felga(20.0, 5.5, "Stal");
        System.out.println(Felga.retRFelgaInfo);

   //     String Info = Felga.retRFelgaInfo;
  //      String Info = Felga.getrFelgaLP;
  //      String FelgaInfo = Felga.getRFelgaInfo;
  //      System.out.println(FelgaInfo);
  //      System.out.println(felgatp);

 */
    }
    private static class Felgalp {
    }
}
