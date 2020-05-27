// Andrzej Pytka nr albumu Nr albumu 11727

// 2) Felga
//  a) Średnica, wielkość cale/milimetry
//  b) Szerokość
//  c) Marteriał

import OPONA.*;


public class Felga
{
    int fSrednica;
    float fSzerokosc;
    String fMaterial;
            String rFelgaInfo;

        public Felga (int xSrednica, float xSzerokosc, String xMaterial)
        {
            fSrednica = xSrednica;
            fSzerokosc = xSzerokosc;
            fMaterial = xMaterial;
            String rFelgaInfo;

            float fSMilimetry = przelicz(fSrednica, True);
            float fSzMlilimetry = przelicz(fSzerokosc, True);

            float oPtimum = fSzMlilimetry + 40;


            rFelgaInfo = "Felga wykonana z " + fMaterial + " w rozmiarze " + fSrednica + " cali, tj.  " + fSMilimetry + " mm średnicy i " + " szerokości " + fSzerokosc + "/" + fSzMlilimetry + ". Dla takiej felgi sugerowana szerokość opony powina być z przedziału " + oPtimum;
            
        }
}
