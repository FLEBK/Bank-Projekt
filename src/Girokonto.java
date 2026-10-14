public class Girokonto extends Konto {

    double sollzins;
    double dispo;

    public Girokonto(double sollzins, double dispo,String iBan,double habenzins,double kontostand)
    {
        super(iBan,habenzins,kontostand);
        this.sollzins = sollzins;
        this.dispo = dispo;
    }

    public void auszahlen(Kontobewegung kb)
    {
        for (Kontobewegung b : myKontobewegungen) {
            kontostand += b.betrag;
        }

        if (kb.betrag <= kontostand + dispo)
        {
            myKontobewegungen.add(kb);
        }else {
            System.out.println("Kreditlimit von Konto "+ iBan+ " überzogen. Buchung über "+kb.betrag+" Euro vom "+kb.Datum + "wurde nicht ausgeführt\n");
        }
    }
}
