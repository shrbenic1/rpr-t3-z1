package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj{
    public enum Grad {
        TRAVNIK (30), ORASJE (31), ZENICA (32), SARAJEVO (33), LIVNO (34), TUZLA (35), MOSTAR (36), BIHAC (37), GORAZDE (38), SIROKIBRIJEG (39), BRCKO (49), MRKONJICGRAD (50), BANJALUKA (51), PRIJEDOR (52), DOBOJ (53), SAMAC (54), BIJELJINA (55), ZVORNIK (56), PALE (57), FOCA (58), TREBINJE (59);

        private final int broj;

        Grad(int broj) {
            this.broj=broj;
        }
        public int getBroj() {
            return broj;
        }
    }

    private String broj;
    private Grad grad;

    public String ispisi() {
        return "0" +  grad.getBroj() + "/" + broj;
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
