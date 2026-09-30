import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {

    String kundenNummer;
    String name;
    String adresse;
    LocalDate kundeSeit;
    private ArrayList<Konto> mykonten = new ArrayList<>();

    public Kunde(String kundenNummer, String name, String adresse, LocalDate kundeSeit)
    {
        this.kundenNummer = kundenNummer;
        this.name=name;
        this.adresse=adresse;
        this.kundeSeit=kundeSeit;
    }

    public void ausgebenKonten(Bank b)
    {
        for (Konto k : mykonten)
        {
            System.out.println("Kontoinhaber: "+ name + "\nIBAN: "+ k.iBan + "\nBIC: "+b.bic + "," + b.instistutenName + "\nKontostand: "+ k.kontostand+"\n");
        }
    }
    public void neuKonto(Konto k)
    {
        mykonten.add(k);
    }
}
