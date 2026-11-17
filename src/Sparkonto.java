import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;

public class Sparkonto extends Konto{

    char art;

    public Sparkonto(char art,String iBan,double habenzins,double kontostand)
    {
     super(iBan,habenzins,kontostand);
     this.art = art;
    }

    public void auszahlen(Kontobewegung kb)
    {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        if (-kb.betrag <= kontostand)
        {
            myKontobewegungen.add(kb);
            kontostand += kb.betrag;
        }else {
            System.out.println("Kontostand von Konto "+ iBan + " überzogen. Buchung über "+nf.format(kb.betrag)+" Euro vom "+kb.datumAusgeben()+" wurde nicht ausgeführt.");
        }
    }

    public void berechnenZinsen(LocalDateTime abschluss)
    {
        zinsenBuchen(berechnenZinssumme(0, abschluss), abschluss);
    }
}
