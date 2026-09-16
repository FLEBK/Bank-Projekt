public class Kunde {

    String kundenNummer;
    String name;
    String adresse;
    Konto[] mykonten;

    public Kunde(String kundenNummer, String name, String adresse)
    {
        this.kundenNummer = kundenNummer;
        this.name=name;
        this.adresse=adresse;
    }
}
