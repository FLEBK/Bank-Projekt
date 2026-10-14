import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Kunde kunde1 = new Kunde("KN0001", "Paul Müller", "Münster", LocalDate.of(2024, 2, 10));
        Girokonto giro1 = new Girokonto(7.5,3000,"DE0001",1.5, 0);

        Kunde kunde2 = new Kunde("KN0002","Liese Fleißig","Osnabrück",LocalDate.of(2021, 5, 2));
        Sparkonto spar1 = new Sparkonto('p',"DE0002",5,0);
        Girokonto giro2 = new Girokonto(7.5,2000,"50060090",1.5,0);

        Bank bank1 = new Bank("WELADED1MST","Sparkasse Münster");
        giro1.einzahlen();
        giro1.auszahlen(4000);

        kunde2.neuKonto(spar1);
        kunde2.neuKonto(giro2);
        kunde2.ausgebenKonten(bank1);

        kunde1.neuKonto(giro1);
        kunde1.ausgebenKonten(bank1);

    }
}
