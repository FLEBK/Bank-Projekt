import java.time.LocalDateTime;

public class Kontobewegung{
    double betrag;
    LocalDateTime Datum;
    String text;
    Konto[] myKonto;

    public Kontobewegung(double beitrag, LocalDateTime datum)
    {
        this.betrag = beitrag;
        this.Datum = datum;
        if (beitrag > 0)
        {
            text = "Einzahlung";
        }else {
            text = "Auszahlung";
        }
    }

    public String datumAusgeben()
    {
        String[] monate = {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        String tag = "" + Datum.getDayOfMonth();
        if (Datum.getDayOfMonth() < 10)
        {
            tag = "0" + tag;
        }
        return tag + "." + monate[Datum.getMonthValue() - 1] + "." + Datum.getYear();
    }
}
