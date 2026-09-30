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

    /*public void auszahlen(Girokonto g, Sparkonto s,Kontobewegung kb)
    {
        if (s.art == 'p'){
            if ( kb.betrag <= kontostand + g.dispo)
            {
                kontostand = kontostand - kb.betrag;
            }else {
                System.out.println("Kreditlimit von Konto "+ iBan + "überzogen. Buchung über "+kb.betrag+" Euro vom ?! wurde nicht ausgeführt");
            }
        } else {
            if (kb.betrag <= kontostand)
            {
                kontostand = kontostand - kb.betrag;
            }else {
                System.out.println("Kontostand zu niedrig!");
            }
        }
    } */
}
