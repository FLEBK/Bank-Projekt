public class Girokonto extends Konto {

    double sollzins;
    double dispo;

    public Girokonto(double sollzins, double dispo,String iBan,double habenzins,double kontostand)
    {
        super(iBan,habenzins,kontostand);
        this.sollzins = sollzins;
        this.dispo = dispo;
    }
}
