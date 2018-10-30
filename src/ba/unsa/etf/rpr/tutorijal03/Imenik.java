package ba.unsa.etf.rpr.tutorijal03;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Imenik {

    private HashMap <String, TelefonskiBroj> imenik = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        if(imenik.containsKey(ime)) {
            return ((TelefonskiBroj) imenik.get(ime)).ispisi();
        }
        else return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String key = entry.getKey();
            TelefonskiBroj brojTelefona = entry.getValue();
            if(brojTelefona.equals(broj)) return key;
        }
        return null;
    }

    String naSlovo(char s) {
        String naSlovo = "";
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String key = entry.getKey();
            TelefonskiBroj brojTelefona = entry.getValue();
            int i = 1;
            if(key.charAt(0)==s) {
                String privremeni;
                privremeni=String.format("%d. %s- %s\n", i, entry, brojTelefona.ispisi());
                naSlovo+=privremeni;
            }
            i++;
        }
        return naSlovo;
    }

    Set<String> izGrada(Grad g) {
        return Collections.emptySet();
    }
    Set<TelefonskiBroj>izGradaBrojevi(Grad g) {return Collections.emptySet();}
}
