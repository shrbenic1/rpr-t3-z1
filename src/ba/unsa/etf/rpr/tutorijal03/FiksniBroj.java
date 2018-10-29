package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj{
    public enum Grad { TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO, MRKONJICGRAD, BANJALUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE}
    private String broj;
    private Grad grad;

    public String ispisi() {
        return grad + "/" + broj;
    }
    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public int hashCode() {
        return grad.hashCode();
    }
    @Override
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        else if (o instanceof FiksniBroj) {
            FiksniBroj fiksni = (FiksniBroj) o;
            return fiksni.broj.equals(this.broj) && fiksni.hashCode() == this.grad.hashCode();
        }
        else return false;
    }
}
