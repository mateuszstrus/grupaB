package OPONA;

public interface Przelicz {
    public static double przelicznik(double cTOm, boolean cale) //cTOm wartość do przeliczenia cale=True  - kierunek cale
    {
        double wartoscIn;
        double wartoscOut;
        wartoscIn = cTOm;
        //calef-t = cale;
        if (cale) {
            wartoscOut = wartoscIn * 2.54;
        }
        else {
            wartoscOut = wartoscIn / 2.54;
        }
        return wartoscOut;
    }
}