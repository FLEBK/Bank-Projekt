import java.time.LocalDateTime;

public class Kontobewegung{
    double betrag;
    LocalDateTime Datum;
    Konto[] myKonto;

    public Kontobewegung(double beitrag, LocalDateTime datum)
    {
        this.betrag = beitrag;
        this.Datum = datum;
    }
}
