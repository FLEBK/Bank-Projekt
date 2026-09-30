import java.time.LocalDateTime;
import java.util.ArrayList;

public class Kontobewegung{
    double betrag;
    LocalDateTime Datum;
    Konto[] myKonto;

    public Kontobewegung(double beitrag)
    {
        this.betrag = beitrag;
    }
}
