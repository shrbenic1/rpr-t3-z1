package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj implements TelefonskiBroj {
    private int mobilnaMreza;
    String broj;
    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }
}
