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
    public void einzahlen(Girokonto g, Sparkonto s,Kontobewegung kb)
    {
        kontostand = kontostand + kb.betrag;
        myKontobewegungen.add(kb);

    }
    public void kontostandausgeben()
    {
        System.out.println("Girokonto: "+ kontostand+"\n");
    }

    public void auszahlen(Girokonto g, Sparkonto s,Kontobewegung kb)
    {
        if (s.art == 'p'){
            if ( <= kontostand + dispo)
            {
                kontostand = kontostand - betrag;
            }else {
                System.out.println("Kreditlimit von Konto "+ iBan + "überzogen. Buchung über "+betrag+" Euro vom ?! wurde nicht ausgeführt");
            }
        }else
        {

        }
    }
}
