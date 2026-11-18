import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime datum = LocalDateTime.of(2026, 2, 11, 0, 0);

        Kunde kunde1 = new Kunde("KN0001", "Paul Müller", "Münster", LocalDate.of(2024, 2, 10));
        Girokonto giro1 = new Girokonto(7.5,3000,"DE86 4005 0150 0050 0600 80",1.5, 0);

        Kunde kunde2 = new Kunde("KN0002","Lieschen Fleisig","Osnabrück",LocalDate.of(2021, 5, 2));
        Sparkonto spar1 = new Sparkonto('p',"DE41 4005 0150 0022 2222 22",5,0);
        Girokonto giro2 = new Girokonto(7.5,2000,"DE75 4005 0150 0050 0600 90",1.5,0);

        Bank bank1 = new Bank("WELADED1MST","Sparkasse Münster");

        Kontobewegung erst1 = new Kontobewegung(1, LocalDateTime.of(2026, 2, 10, 0, 0));
        erst1.text = "Ersteinzahlung";
        Kontobewegung erst2 = new Kontobewegung(1, LocalDateTime.of(2026, 1, 2, 0, 0));
        erst2.text = "Ersteinzahlung";
        Kontobewegung erst3 = new Kontobewegung(1, LocalDateTime.of(2026, 1, 2, 0, 0));
        erst3.text = "Ersteinzahlung";

        Kontobewegung kb1 = new Kontobewegung(2850, datum);
        Kontobewegung kb2 = new Kontobewegung(+10000.50, datum);
        Kontobewegung kb3 = new Kontobewegung(-50, datum);
        Kontobewegung kb4 = new Kontobewegung(+8500, datum);

        giro1.einzahlen(erst1);
        spar1.einzahlen(erst2);
        giro2.einzahlen(erst3);

        spar1.einzahlen(kb1);
        giro2.auszahlen(kb2);
        giro2.auszahlen(kb3);
        giro1.auszahlen(kb4);

        giro1.berechnenZinsen(LocalDateTime.of(2026, 4, 1, 0, 0));
        giro2.berechnenZinsen(LocalDateTime.of(2026, 4, 1, 0, 0));
        spar1.berechnenZinsen(LocalDateTime.of(2027, 1, 1, 0, 0));
        giro1.berechnenZinsen(LocalDateTime.of(2026, 7, 1, 0, 0));
        giro2.berechnenZinsen(LocalDateTime.of(2026, 7, 1, 0, 0));
        giro1.berechnenZinsen(LocalDateTime.of(2026, 10, 1, 0, 0));
        giro2.berechnenZinsen(LocalDateTime.of(2026, 10, 1, 0, 0));
        giro1.berechnenZinsen(LocalDateTime.of(2027, 1, 1, 0, 0));
        giro2.berechnenZinsen(LocalDateTime.of(2027, 1, 1, 0, 0));



        kunde1.neuKonto(giro1);
        kunde1.ausgebenKonten(bank1);

        kunde2.neuKonto(spar1);
        kunde2.neuKonto(giro2);
        kunde2.ausgebenKonten(bank1);

        spar1.ausgebenBewegungen(bank1,kunde2);
        giro1.ausgebenBewegungen(bank1,kunde1);
        giro2.ausgebenBewegungen(bank1,kunde2);

    }
}
