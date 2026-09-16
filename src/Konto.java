public class Konto {

    String iBan;
    double kontostand;
    double habenzins;
    Kunde[] myKunde;
    Bew[] myKontobewegung;

    public Konto(String iBan,double habenzins,double kontostand)
    {
        this.iBan = iBan;
        this.habenzins = habenzins;
        this.kontostand = kontostand;
    }
}
