package ba.unsa.etf.rpr.tutorijal03;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;
import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        imenik.dodaj("Hana Hanic", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-456"));
        assertEquals("033/123-456", imenik.dajBroj("Meho Mehic"));
        FiksniBroj broj = new FiksniBroj(SARAJEVO, "123-156");
        assertEquals("Hana Hanic", imenik.dajIme(broj)); //testiramo dajIme
        assertEquals("+1 23 45-67-89", imenik.dajBroj("John Smith")); //testiramo klasu MedunarodniBroj
        MedunarodniBroj medunarodniBroj = new MedunarodniBroj("+1", "23 45-67-89");
        assertEquals("John Smith", imenik.dajIme(medunarodniBroj)); //testiramo klasu MedunarodniBroj
        imenik.dodaj("Sven Hrbenic", new MobilniBroj(062, "358-994")); //testiramo klasu MobilniBroj
        MobilniBroj mobilniBroj = new MobilniBroj(062, "358-994");
        assertEquals("Sven Hrbenic", imenik.dajIme(mobilniBroj)); // testiramo klasu MobilniBroj
    }

    @Test
    void naSlovo() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        assertEquals( "1. Ivo Ivic - 061/321-645", imenik.naSlovo('I').trim());
    }

    @Test
    void izGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<String> set = imenik.izGrada(SARAJEVO);
        String result = "";
        for (String ime: set) {
            result += ime + ",";
        }
        assertEquals("Ivo Ivic,Meho Mehic,Sara Sarac,", result);
    }

    @Test
    void izGradaBrojevi() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<TelefonskiBroj> set = imenik.izGradaBrojevi(SARAJEVO);
        String result = "";
        for (TelefonskiBroj broj: set) {
            result += broj.ispisi() + ",";
        }
        assertEquals("033/123-156,033/123-456,033/123-656,", result);
    }
}