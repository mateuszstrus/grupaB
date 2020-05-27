
// Andrzej Pytka nr albumu Nr albumu 11727

// 2) Felga - kostruktor klasy Felga
//  a) Średnica, wielkość cale/milimetry
//  b) Szerokość
//  c) Marteriał
package FELGA;


import static OPONA.Przelicz.przelicznik;

public class Felga
{
    public static String retRFelgaInfo;

    double fSrednica;
    double fSzerokosc;
    String fMaterial;
    String rFelgaInfo;

    public Felga(double fSrednica, double fSzerokosc, String fMaterial) {
        this.fSrednica = fSrednica;
        this.fSzerokosc = fSzerokosc;
        this.fMaterial = fMaterial;

        double fSMilimetry = przelicznik(fSrednica,true);
        double fSzMlilimetry = przelicznik(fSzerokosc, true);

        double oPtimum = fSzMlilimetry + 40.0;

        rFelgaInfo = "Felga wykonana z " + fMaterial + " w rozmiarze " + fSrednica + " cali, tj.  "
                + fSMilimetry + " mm średnicy i " + " szerokości " + fSzerokosc + "/" + fSzMlilimetry
                + ". Dla takiej felgi sugerowana szerokość opony powina być z przedziału " + oPtimum;
 //       System.out.println(rFelgaInfo); //
        retRFelgaInfo = rFelgaInfo;
        return;
    }
}