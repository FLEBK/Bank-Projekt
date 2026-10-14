public class Sparkonto extends Konto{

    char art;

    public Sparkonto(char art,String iBan,double habenzins,double kontostand)
    {
     super(iBan,habenzins,kontostand);
     this.art = art;
    }

    public void auszahlen(Kontobewegung kb)
    {
        for (Kontobewegung b : myKontobewegungen) {
            kontostand += b.betrag;
        }

        if (kb.betrag <= kontostand)
        {
            myKontobewegungen.add(kb);
        }else {
            System.out.println("Kontostand von Konto "+ iBan + "überzogen. Buchung über "+kb.betrag+" Euro vom ?! wurde nicht ausgeführt\n");
        }
    }
}
