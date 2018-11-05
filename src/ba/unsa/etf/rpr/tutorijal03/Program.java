package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        String grad, broj, ime, drzava, slovo;
        Imenik imenik = new Imenik();
        int opcija, opcija1;
        while (true) {
            System.out.print("Unesite odgovarajući broj u ovisnosti željene operacije: \n 1. Unos novog broja \n 2. Saznaj broj određene osobe \n " +
                    "3. Saznaj vlasnika određenog broja \n 4. Saznaj imena osoba iz nekog grada (osobe s istim pozivnim fiksnim brojem)  \n " +
                    "5. Saznaj brojeve osoba iz nekog grada (osobe s istim pozivnim fiksnim brojem) \n 6. Saznaj sva imena koja počinju na neko slovo\n " +
                    "7. Prekid rada \n");
            opcija = ulaz.nextInt();
            if (opcija == 7) {
                break;
            }
            switch (opcija) {
                case 1:
                    while (true) {
                        System.out.print("Za unos osobe s fiksnim brojem telefona unesite opciju 0 \nZa unos osobe s mobilnim brojem telefona" +
                                " unesite opciju 1 \nZa unos osobe s međunarodnim brojem telefona unesite opciju 2 \nZa prekid unosa osoba unesite opciju 3 \n");
                        opcija1 = ulaz.nextInt();
                        if (opcija1 == 3) {
                            break;
                        }
                        switch (opcija1) {
                            case 0:
                                System.out.print("Unesite grad: ");
                                grad = ulaz.next();
                                FiksniBroj.Grad noviGrad = FiksniBroj.Grad.valueOf(grad.toUpperCase());
                                System.out.print("Unesite broj: ");
                                ulaz.nextLine();
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new FiksniBroj(noviGrad, broj));
                                break;
                            case 1:
                                int brojMreze;
                                System.out.print("Unesite mobilnu mrežu: ");
                                brojMreze = ulaz.nextInt();
                                System.out.print("Unesite broj: ");
                                ulaz.nextLine();
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new MobilniBroj(brojMreze, broj));
                                break;
                            case 2:
                                System.out.print("Unesite pozivni broj za državu: ");
                                ulaz.nextLine();
                                drzava = ulaz.nextLine();
                                System.out.print("Unesite broj: ");
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new MedunarodniBroj(drzava, broj));
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Unesite ime osobe: ");
                    ulaz.nextLine();
                    ime = ulaz.nextLine();
                    broj = imenik.dajBroj(ime);
                    System.out.println(opcija);
                    break;
                case 3:
                    System.out.print("Za osobu s fiksnim brojem tefona unesite opciju 0, za osobu s mobilnim brojem" +
                            " unesite opciju 1 dok za osobu s međunarodnim brojem unosite opciju 2 \n");
                    opcija1 = ulaz.nextInt();
                    switch (opcija1) {
                        case 0:
                            System.out.print("Unesite grad: ");
                            FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                            System.out.print("Unesite broj: ");
                            ulaz.nextLine();
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new FiksniBroj(grad1, broj)));
                            break;
                        case 1:
                            int brojMreze;
                            System.out.print("Unesite mobilnu mrežu: ");
                            brojMreze = ulaz.nextInt();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new MobilniBroj(brojMreze, broj)));
                            break;
                        case 2:
                            System.out.print("Unesite pozivni broj za državu: ");
                            drzava = ulaz.next();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new MedunarodniBroj(drzava, broj)));
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<String> set = imenik.izGrada(grad1);
                    String result = "";
                    for (String ime2 : set) {
                        result += ime2 + ",";
                    }
                    System.out.println(result);
                    break;
                case 5:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad gradNovi = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<TelefonskiBroj> set2 = imenik.izGradaBrojevi(gradNovi);
                    String result1 = "";
                    for (TelefonskiBroj ime2 : set2) {
                        result1 += ime2.ispisi() + ",";
                    }
                    System.out.println(result1);
                    break;
                case 6:
                    System.out.print("Unesite slovo: ");
                    ulaz.nextLine();
                    slovo = ulaz.nextLine();
                    char c = String.valueOf(slovo.toUpperCase().charAt(0)).charAt(0);
                    System.out.print(imenik.naSlovo(c));
                    break;
            }
        }
    }
}