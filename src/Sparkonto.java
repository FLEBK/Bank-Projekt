public class Sparkonto extends Konto{

    char art;

    public Sparkonto(char art,String iBan,double habenzins,double kontostand)
    {
     super(iBan,habenzins,kontostand);
     this.art = art;
    }

    public void auszahlen(double betrag)
    {
        if (betrag <= kontostand)
        {
            kontostand = kontostand - betrag;
        }else {
            System.out.println("Kontostand zu niedrig!");
        }
    }
}
