import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;

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
            kontostand += kb.betrag;
        }
    }

    public double berechnenZinssumme(double sollzins, LocalDateTime abschluss) //Zins berechnung falsch wenn über einen längerne
    {
        double summe = 0;
        double stand = 0;
        LocalDateTime letztesDatum = null;

        for (Kontobewegung b : myKontobewegungen) {
            if (letztesDatum != null)
            {
                long tage = ChronoUnit.DAYS.between(letztesDatum, b.Datum);
                if (stand > 0)
                {
                    summe += habenzins * stand / 100 / 365 * tage;
                }else {
                    summe += sollzins * stand / 100 / 365 * tage;
                }
            }
            stand += b.betrag;
            if (!b.text.equals("Ersteinzahlung"))
            {
                letztesDatum = b.Datum;
            }
        }

        if (letztesDatum != null)
        {
            long tage = ChronoUnit.DAYS.between(letztesDatum, abschluss);
            if (stand > 0)
            {
                summe += habenzins * stand / 100 / 365 * tage;
            }else {
                summe += sollzins * stand / 100 / 365 * tage;
            }
        }
        return summe;
    }

    public void zinsenBuchen(double zinsen, LocalDateTime abschluss)
    {
        Kontobewegung kb = new Kontobewegung(zinsen, abschluss);
        kb.text = "Zinsen";
        myKontobewegungen.add(kb);
        kontostand += zinsen;
    }

    public void ausgebenBewegungen(Bank b,Kunde k)
    {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        System.out.println("\nKontoauszug\n     IBAN: "+ iBan + ",\n     BIC: "+b.bic + ", " + b.instistutenName + ",\n     Kontostand: " + nf.format(kontostand) + " Euro" + "\n     Kontoinhaber: " + k.name + "\n");
        int nr = 1;
        for (Kontobewegung kb : myKontobewegungen) {
            System.out.println(nr + "   " + kb.datumAusgeben() + "\t" + nf.format(kb.betrag) + " Euro\t" + kb.text);
            nr++;
        }
    }
}
