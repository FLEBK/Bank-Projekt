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
    public void einzahlen (Kontobewegung kb)
    {
        if(kb.betrag >0)
        {
            myKontobewegungen.add(kb);
        }
    }
    public void ausgebenBewegungen(Bank b,Kunde k)
    {
        ;
        System.out.println("Kontoauszug\nIBAN: "+ iBan + "\nBIC: "+b.bic + ", " + b.instistutenName + "\nKontostand: " + kontostand + " Euro" + "\nKontoinhaberin: " + k.name);
    }
}
