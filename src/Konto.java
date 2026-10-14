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
    public void einzahlen ()
    {

    }
    public void kontostandausgeben()
    {
        System.out.println("Girokonto: "+ kontostand+"\n");
    }
}
