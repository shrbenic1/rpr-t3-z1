package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj implements TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return mobilnaMreza;
    }

    @Override
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        else if (o instanceof MobilniBroj) {
            MobilniBroj mobilni = (MobilniBroj) o;
            return mobilni.broj.equals(this.broj) && mobilni.hashCode() == this.hashCode();
        }
        else return false;
    }
}
