public class Girokonto extends Konto {

    double sollzins;
    double dispo;

    public Girokonto(double sollzins, double dispo,String iBan,double habenzins,double kontostand)
    {
        super(iBan,habenzins,kontostand);
        this.sollzins = sollzins;
        this.dispo = dispo;
    }

    public void auszahlen(double betrag)
    {
        if (betrag <= kontostand + dispo)
        {
            kontostand = kontostand - betrag;
        }else {
            System.out.println("Kreditlimit von Konto "+ iBan + "überzogen. Buchung über "+betrag+" Euro vom ?! wurde nicht ausgeführt");
        }
    }
}
