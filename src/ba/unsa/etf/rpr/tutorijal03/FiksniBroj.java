package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj{
    String broj;
    Grad grad;
    public String ispisi() {
        return "";
    }
    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        this.broj=broj;
    }
}
