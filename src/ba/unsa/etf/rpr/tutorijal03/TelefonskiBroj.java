package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable <TelefonskiBroj> {
    @Override
    public int compareTo(TelefonskiBroj o) {
        return ispisi().compareTo(o.ispisi());
    }
    abstract String ispisi();
}
