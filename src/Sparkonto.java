public class Sparkonto extends Konto{

    char art;

    public Sparkonto(char art,String iBan,double habenzins,double kontostand)
    {
     super(iBan,habenzins,kontostand);
     this.art = art;
    }
}
