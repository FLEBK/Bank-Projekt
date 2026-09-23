import java.time.LocalDate;

public class Kunde {

    String kundenNummer;
    String name;
    String adresse;
    LocalDate kundeSeit;
    Konto[] mykonten;

    public Kunde(String kundenNummer, String name, String adresse, LocalDate kundeSeit)
    {
        this.kundenNummer = kundenNummer;
        this.name=name;
        this.adresse=adresse;
        this.kundeSeit=kundeSeit;
    }
}
