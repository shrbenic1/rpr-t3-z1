package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava=drzava;
        this.broj=broj;
    }

    public String ispisi() {
        return drzava + " " + broj;
    }

    @Override
    public int hashCode() {
        return drzava.hashCode();
    }

    @Override
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        else if (o instanceof MedunarodniBroj) {
            MedunarodniBroj medunarodni = (MedunarodniBroj) o;
            return medunarodni.broj.equals(this.broj) && medunarodni.hashCode() == this.hashCode();
        }
        else {
            return false;
        }
    }
}
