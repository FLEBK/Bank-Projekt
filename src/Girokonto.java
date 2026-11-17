import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;

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
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        if (-kb.betrag <= kontostand + dispo)
        {
            myKontobewegungen.add(kb);
            kontostand += kb.betrag;
        }else {
            System.out.println("Kreditlimit von Konto "+ iBan+ " überzogen. Buchung über "+nf.format(kb.betrag)+" Euro vom "+kb.datumAusgeben() + " wurde nicht ausgeführt.");
        }
    }

    public void berechnenZinsen(LocalDateTime abschluss)
    {
        zinsenBuchen(berechnenZinssumme(sollzins, abschluss), abschluss);
    }
}
