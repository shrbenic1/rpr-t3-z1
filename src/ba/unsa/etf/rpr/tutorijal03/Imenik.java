package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap imenik;
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(broj, ime);
    }

}
