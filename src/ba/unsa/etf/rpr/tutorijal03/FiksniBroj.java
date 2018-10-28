package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj{
    private String broj;
    private Grad grad;
    public String ispisi() {
        return grad + "/" + broj;
    }
    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        this.broj=broj;
    }
}
