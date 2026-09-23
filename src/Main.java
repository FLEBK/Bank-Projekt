import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Kunde kunde1 = new Kunde("KN0001", "Paul Müller", "Münster", LocalDate.of(2024, 2, 10));
        Girokonto giro1 = new Girokonto(7.5,3000,"DE0001",1.5, 0);

        Kunde kunde2 = new Kunde("KN0002","Liese Fleißig","Osnabrück",LocalDate.of(2021, 5, 2));
        Sparkonto spar1 = new Sparkonto('p',"DE0002",5,0);



        giro1.einzahlen(4000);
        giro1.kontostandausgeben(); // das muss lieber über Kunde laufen

        spar1.auszahlen(200);
        spar1.kontostandausgeben();
    }
}
