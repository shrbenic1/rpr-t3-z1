package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap imenikPoImenu;
    private HashMap imenikPoBroju;

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

}
