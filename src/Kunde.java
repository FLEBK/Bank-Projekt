import java.time.LocalDate;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class Kunde {

    String kundenNummer;
    String name;
    String adresse;
    LocalDate kundeSeit;
    public ArrayList<Konto> mykonten = new ArrayList<>();

    public Kunde(String kundenNummer, String name, String adresse, LocalDate kundeSeit)
    {
        this.kundenNummer = kundenNummer;
        this.name=name;
        this.adresse=adresse;
        this.kundeSeit=kundeSeit;
    }

    public void ausgebenKonten(Bank b)
    {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("\nKontoinhaber: " + name);
        for (Konto k : mykonten) {
            System.out.println("IBAN: " + k.iBan + ",");
            System.out.println("BIC: " + b.bic + ", " + b.instistutenName + ",");
            System.out.println("Kontostand: " + nf.format(k.kontostand) + " Euro");
        }

    }
    public void neuKonto(Konto k)
    {
        mykonten.add(k);
    }
}
