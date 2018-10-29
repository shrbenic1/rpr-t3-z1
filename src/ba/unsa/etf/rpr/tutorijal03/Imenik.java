package ba.unsa.etf.rpr.tutorijal03;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Imenik {

    private HashMap <String, TelefonskiBroj> imenikPoImenu = new HashMap<>();
    private HashMap <TelefonskiBroj, String> imenikPoBroju = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenikPoBroju.put(broj, ime);
        imenikPoImenu.put(ime, broj);
    }
    public String dajBroj(String ime) {
        if(imenikPoImenu.containsKey(ime)) {
            return ((TelefonskiBroj) imenikPoImenu.get(ime)).ispisi();
        }
        else return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        if(imenikPoBroju.containsKey(broj)) {
            return (String) imenikPoBroju.get(broj);
        }
        else return null;
    }

    String naSlovo(char s) {return "";}
    Set<String> izGrada(Grad g) {return Collections.emptySet();}
    Set<TelefonskiBroj>izGradaBrojevi(Grad g) {return Collections.emptySet();}
}
