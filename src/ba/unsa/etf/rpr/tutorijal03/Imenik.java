package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap imenikPoImenu;
    private HashMap imenikPoBroju;
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenikPoBroju.put(broj, ime);
        imenikPoImenu.put(ime, broj);
    }

}
