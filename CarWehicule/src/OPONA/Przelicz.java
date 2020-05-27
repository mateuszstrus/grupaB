package OPONA;

import javax.swing.*;

public interface Przelicz {
    public static void przelicznik(int cTOm, boolean cale) //cTOm wartość do przeliczenia cale=True  - kierunek cale
    {

        float wartoscIn;
        float wartoscOut;

        wartoscIn = cTOm;
        cale = cale;

        if (cale) wartoscOut = wartoscIn * 2.54;
        else wartoscOut = wartoscIn / 2.54;

        return wartoscOut;

    }
}