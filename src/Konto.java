import java.util.ArrayList;

public class Konto {

    String iBan;
    double kontostand;
    double habenzins;
    Kunde myKunde;
    ArrayList<Kontobewegung> myKontobewegungen = new ArrayList<Kontobewegung>();

    public Konto(String iBan,double habenzins,double kontostand)
    {
        this.iBan = iBan;
        this.habenzins = habenzins;
        this.kontostand = kontostand;
    }
    public void einzahlen(double betrag)
    {
        kontostand = kontostand+betrag;
    }
    public void kontostandausgeben()
    {
        System.out.println("Girokonto: "+ kontostand);
    }
    public void Kontodatenausgeben()
    {
        System.out.println("");
    }
}
